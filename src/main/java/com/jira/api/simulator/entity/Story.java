package com.jira.api.simulator.entity;

import com.jira.api.simulator.values.Status;

public class Story {
	String storyId;
	Status status;
	int points;
	
	public Story(String storyId, Status status, int points) {
		super();
		this.storyId = storyId;
		this.status = status;
		this.points = points;
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
	
	
	
	
}
