package com.redhat.bpms.integration;

import java.net.URL;


import org.kie.services.client.api.RemoteRuntimeEngineFactory;


public class BpmsRestRemoteProcessControl extends BpmsRemoteProcessControl {

	public BpmsRestRemoteProcessControl(String deploymentId, URL deploymentUrl, String userId, String password) {
		super();

	
		setRuntimeEngine(RemoteRuntimeEngineFactory.newRestBuilder()
				  .addDeploymentId(deploymentId)
				  .addUrl(deploymentUrl)
				  .addUserName(userId)
				  .addPassword(password)
//				  .addTimeout(timeOut)
				  .build());
		

	}
}
