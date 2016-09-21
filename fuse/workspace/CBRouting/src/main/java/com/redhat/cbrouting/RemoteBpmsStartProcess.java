package com.redhat.cbrouting;

import java.net.MalformedURLException;
import java.net.URL;

import com.redhat.bpms.integration.BpmsRemoteProcessControl;
import com.redhat.bpms.integration.BpmsRestRemoteProcessControl;

import java.util.HashMap;
import java.util.Map;
import java.net.URL;

import com.redhat.bpms.examples.mortgage.Property;
import com.redhat.bpms.examples.mortgage.Applicant;
import com.redhat.bpms.examples.mortgage.Application;


public class RemoteBpmsStartProcess {
	
	final String DEPLOYMENT_ID = "com.redhat.bpms.examples:mortgage:1";
	final String DEPLOYMENT_URL = "http://localhost:8180/business-central";
	final String REST_USER = "ayuen";
	final String REST_PASSWORD = "Welcome||7";
	final String PROCESS_ID = "com.redhat.bpms.examples.mortgage.MortgageApplication";
	
	private BpmsRemoteProcessControl processControl;
	
	public RemoteBpmsStartProcess() throws MalformedURLException {
		processControl = new BpmsRestRemoteProcessControl(DEPLOYMENT_ID, new URL(DEPLOYMENT_URL), REST_USER, REST_PASSWORD);
	}

	public String startProcess(Map<String, Object> params)  {
		return (processControl.startProcess(PROCESS_ID, params) == null)? "Start Process Failed": "Start Process Succeeded";
	}

	public String transformAndStartProces(homeloancust.Application srcApp) {
		Map<String, Object> params = new HashMap<String, Object>();
		
		Applicant applicant = new Applicant();
		applicant.setName(srcApp.getName());
		applicant.setSsn(srcApp.getSocialSecurityNumber());
		applicant.setIncome(srcApp.getAnnualIncome());
		
		Property property = new Property();
		property.setAddress(srcApp.getAddress());
		property.setPrice(srcApp.getSalesPrice());
		
		Application application = new Application();
		application.setDownPayment(srcApp.getDownPayment());
		application.setAmortization(Integer.valueOf(srcApp.getAmortization()));
		application.setApplicant(applicant);
		application.setProperty(property);
		   
		params.put("application", application);
		
		return startProcess(params);
	}
/*	<name>John</name>
	<socialSecurityNumber>123456780</socialSecurityNumber>
	<annualIncome>150000</annualIncome>
	<address>1 Miller Street</address>
	<salesPrice>1000000</salesPrice>
	<downPayment>400000</downPayment>
	<amortization>15</amortization>*/

	
	public static void main(String [ ] args) throws MalformedURLException {

		
		RemoteBpmsStartProcess remote = new RemoteBpmsStartProcess();

		
		Map<String, Object> params = new HashMap<String, Object>();
		
		Applicant applicant = new Applicant();
		applicant.setName("John");
		applicant.setSsn(123456789);
		applicant.setIncome(150000);
		
		Property property = new Property();
		property.setAddress("1 Miller Street");
		property.setPrice(1000000);
		
		Application application = new Application();
		application.setDownPayment(400000);
		application.setAmortization(15);
		application.setApplicant(applicant);
		application.setProperty(property);
		   
		params.put("application", application);


        // start the user task
		System.out.println("StarProcess result: " + remote.startProcess(params));

    }
}
