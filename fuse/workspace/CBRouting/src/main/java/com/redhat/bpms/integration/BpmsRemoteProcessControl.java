package com.redhat.bpms.integration;

import java.util.List;
import java.util.Map;

import org.jbpm.services.task.utils.ContentMarshallerHelper;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.api.task.TaskService;
import org.kie.api.task.model.Content;
import org.kie.api.task.model.Task;
import org.kie.api.task.model.TaskSummary;
import org.kie.api.runtime.manager.RuntimeEngine;


// TODO Add methods to it as required
// This is a simple Facade for the Remote Java API. It provides convenience methods to
// control the remote execution of BPMS processes and tasks
public class BpmsRemoteProcessControl {
	
	private final String LANGUAGE = "en-UK";

    protected RuntimeEngine engine;
    protected KieSession ksession;
    protected TaskService taskService;
    
/*    public BpmsRemoteProcessControl(String deploymentId, URL deploymentUrl, String userId, String password)  
    {  
        // setup Remote Java API services
        RemoteRuntimeEngineFactory restSessionFactory = new RemoteRestRuntimeEngineFactory(deploymentId, deploymentUrl, userId, password);

        engine = restSessionFactory.newRuntimeEngine();
        ksession = engine.getKieSession();
        taskService = engine.getTaskService();
    }  */

    public BpmsRemoteProcessControl() {
    	
    }
    
    public void setRuntimeEngine(RuntimeEngine engine)  
    {  
        // setup Remote Java API services
        this.engine = engine;
        ksession = engine.getKieSession();
        taskService = engine.getTaskService();
    }  
    
    public ProcessInstance startProcess(String processId, Map<String, Object> params) {
    	return ksession.startProcess(processId, params);
    }
    
    public void abortProcess(long processInstanceId) {
    	ksession.abortProcessInstance(processInstanceId);
    }
    
    public List<TaskSummary> getTasksAssignedAsPotentialOwner(String taskUserId) {
    	return taskService.getTasksAssignedAsPotentialOwner(taskUserId, LANGUAGE);
    }
    
    public List<TaskSummary> getTasksAssignedAsBusinessAdministrator(String taskUserId) {
    	return taskService.getTasksAssignedAsBusinessAdministrator(taskUserId, LANGUAGE);
    }
    
    public Task getTaskById(long taskId) {
    	return taskService.getTaskById(taskId);
    }
    
    public void claim(long taskId, String taskUserId) {
    	taskService.claim(taskId, taskUserId);
    }
    
    public Map<String, Object> start(long taskId, String taskUserId) {
    	taskService.start(taskId, taskUserId);
    	Content content = taskService.getContentById(getTaskById(taskId).getTaskData().getDocumentContentId());
    	return (Map<String, Object>) ContentMarshallerHelper.unmarshall(content.getContent(), null);
    }
    
    public void complete(long taskId, String taskUserId, Map<String, Object>params) {
    	taskService.complete(taskId, taskUserId, params);
    }
    
    public void release(long taskId, String taskUserId) {
    	taskService.release(taskId, taskUserId);
    }
}
