package com.jira.api.simulator.entity;

import java.util.List;

public class ReleaseReport {
	
	String projectName;
	String version;
	List<Story> storyList;
	
	public ReleaseReport(String projectName, String version, List<Story> storyList) {
		super();
		this.projectName = projectName;
		this.version = version;
		this.storyList = storyList;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Story> getStoryList() {
		return storyList;
	}

	public void setStoryList(List<Story> storyList) {
		this.storyList = storyList;
	}
}
