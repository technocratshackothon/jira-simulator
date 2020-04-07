package com.jira.api.simulator.entity;

import com.jira.api.simulator.values.Priority;
import com.jira.api.simulator.values.Severity;
import com.jira.api.simulator.values.Status;

public class Defect {

	String defectId;
	Status status;
	Severity severity;
	Priority priority;
	int points;
	
	public Defect(String defectId, Status status, Severity severity, Priority priority, int points) {
		super();
		this.defectId = defectId;
		this.status = status;
		this.severity = severity;
		this.priority = priority;
		this.points = points;
	}

	public String getDefectId() {
		return defectId;
	}

	public void setDefectId(String defectId) {
		this.defectId = defectId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
