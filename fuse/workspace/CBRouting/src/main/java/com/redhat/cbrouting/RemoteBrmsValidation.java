package com.redhat.cbrouting;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.TransformerException;


import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RemoteBrmsValidation {
	
	final static String DEPLOYMENT_ID = "com.redhat.bpms.examples:mortgage:1";
	final static String REST_USER = "ayuen";
	final static String REST_PASSWORD = "Welcome||7";
	final static String PROCESS_ID = "com.redhat.bpms.examples.mortgage.MortgageApplication";
	final static String PORT = "8180";
	
	private static final String BRMS_XML = "<batch-execution lookup=\"defaultStatelessKieSession\">" +
	   "<insert out-identifier=\"Application\">" +
	    "<com.redhat.brms.mortgageappvalidation.Application>" +
		"<name>Ben</name>" +
		"<socialSecurityNumber>1234567890</socialSecurityNumber>" +
		"<annualIncome>150000</annualIncome>" +
		"<address>1 Miller Street</address>" +
		"<salesPrice>1000000</salesPrice>" +
		"<downPayment>400000</downPayment>" +
		"<amortization>15</amortization>" +
	    "</com.redhat.brms.mortgageappvalidation.Application>" +
	    "</insert>" +
	    "<fire-all-rules />" +
	    "</batch-execution>";

	private static final String BRMS_POST_URL = "http://localhost:" + PORT + "/kie-server/services/rest/server/containers/Validation";
	
	private static final String BPMS_XML = "<com.redhat.bpms.examples.mortgage.Application>" +
			   "<com.redhat.bpms.examples.mortgage.Applicant>" +
				"<name>Ben</name>" +
				"<ssn>1234567890</ssn>" +
				"<income>150000</income>" +
				"/<com.redhat.bpms.examples.mortgage.Applicant>" +
				"<com.redhat.bpms.examples.mortgage.Property>" + 
				"<address>1 Miller Street</address>" +
				"<price>1000000</price>" +
				"</com.redhat.bpms.examples.mortgage.Property>" + 
				"<downPayment>400000</downPayment>" +
				"<amortization>15</amortization>" +
			    "</com.redhat.bpms.examples.mortgage.Application>";

			private static final String BPMS_POST_URL = "http://localhost:" + PORT + "/business-central/rest/runtime/" +
			DEPLOYMENT_ID + "/process/" + PROCESS_ID + "/start";
	
	
	private static final String USER_AGENT = "Mozilla/5.0";
	
	private static String START_TAG = "execution-results&gt;";
	private static String END_TAG = "/result&gt;";

	
	public String validate(String xml) throws IOException  {

		return post_xml(BRMS_POST_URL, xml);
	}

	public String createProcessInstance(String xml) throws IOException  {
		System.out.println("\n" + BPMS_POST_URL + "\n\n" + xml);
		return post_xml(BPMS_POST_URL, xml);
	}
	
	private String post_xml(String url, String xml) throws IOException  {
		
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope("localhost", Integer.parseInt(PORT)),
                new UsernamePasswordCredentials(REST_USER, REST_PASSWORD));
        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider)
                .build();


            InputStreamEntity reqEntity = new InputStreamEntity( new ByteArrayInputStream(xml.getBytes()));
            reqEntity.setContentType("application/xml");
            reqEntity.setChunked(true);
           
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("User-Agent", USER_AGENT);
            httpPost.setEntity(new BufferedHttpEntity(reqEntity));

            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            
            
            System.out.println("POST Response Status:: " + statusCode);

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpResponse.getEntity().getContent()));
     
            String inputLine;
            StringBuffer response = new StringBuffer();
     
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();
     
            // print result
            String result = filter(response.toString());
            System.out.println(result);
            httpClient.close();

        return result;
	}
	
	private String filter(String xml) {
		String result = "";
		
		int pos = xml.indexOf(START_TAG);
		result = xml.substring(pos + START_TAG.length());
		pos = result.indexOf(END_TAG);
		result = result.substring(0, pos + END_TAG.length());
		result = result.replaceAll("&lt;", "<");
		result = result.replaceAll("&gt;", ">");
		
		return result;
	}
	

	
	public static void main(String [ ] args) throws IOException, UnsupportedOperationException, org.xml.sax.SAXException, TransformerException, ParserConfigurationException {
		RemoteBrmsValidation val = new RemoteBrmsValidation();
		
		val.validate(BRMS_XML);
		val.createProcessInstance(BPMS_XML);
	}
}
