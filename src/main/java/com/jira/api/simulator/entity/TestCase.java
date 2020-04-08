package com.jira.api.simulator.entity;

import com.jira.api.simulator.values.ExecutionStatus;

public class TestCase {

	String testCaseId;
	ExecutionStatus executionStatus;
	
	public TestCase(String testCaseId, ExecutionStatus executionStatus) {
		super();
		this.testCaseId = testCaseId;
		this.executionStatus = executionStatus;
	}
	
	public String getTestCaseId() {
		return testCaseId;
	}
	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}
	public ExecutionStatus getExecutionStatus() {
		return executionStatus;
	}
	public void setExecutionStatus(ExecutionStatus executionStatus) {
		this.executionStatus = executionStatus;
	}
	
	
}
