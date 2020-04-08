package com.jira.api.simulator.entity;

import java.util.List;

import com.jira.api.simulator.values.Status;

public class Story {
	String storyId;
	Status status;
	int points;
	List<Defect> defectList;
	List<TestCase> testCaseList;
	
	public Story(String storyId, Status status, int points, List<Defect> defectList, List<TestCase> testCaseList) {
		super();
		this.storyId = storyId;
		this.status = status;
		this.points = points;
		this.defectList = defectList;
		this.testCaseList = testCaseList;
	}

	public String getStoryId() {
		return storyId;
	}

	public void setStoryId(String storyId) {
		this.storyId = storyId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public List<Defect> getDefectList() {
		return defectList;
	}

	public void setDefectList(List<Defect> defectList) {
		this.defectList = defectList;
	}

	public List<TestCase> getTestCaseList() {
		return testCaseList;
	}

	public void setTestCaseList(List<TestCase> testCaseList) {
		this.testCaseList = testCaseList;
	}
	
}
