package com.jira.api.simulator.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jira.api.simulator.entity.Defect;
import com.jira.api.simulator.entity.ReleaseReport;
import com.jira.api.simulator.entity.Story;
import com.jira.api.simulator.values.Points;
import com.jira.api.simulator.values.Priority;
import com.jira.api.simulator.values.Severity;
import com.jira.api.simulator.values.Status;

@Service
public class ReleaseDetailsService {

	String projectName;
	String releaseVersion;

	public ReleaseReport getReleaseDetails(String projectName, String releaseVersion) {
		System.out.println(projectName + "  " + releaseVersion);
		return new ReleaseReport(projectName, releaseVersion, getStoryList(), getDefectList());
	}

	private List<Defect> getDefectList() {
		return Arrays.asList(
				new Defect("ONEFDP-1234", Status.CLOSED, Severity.MEDIUM, Priority.P1, Points.THIRTEEN.getPoints()),
				new Defect("ONEFDP-7364", Status.OPEN, Severity.HIGH, Priority.P2, Points.TWO.getPoints()),
				new Defect("ONEFDP-1234", Status.CLOSED, Severity.MEDIUM, Priority.P1, Points.THIRTEEN.getPoints()),
				new Defect("ONEFDP-1964", Status.CLOSED, Severity.HIGH, Priority.P3, Points.THREE.getPoints()),
				new Defect("ONEFDP-3344", Status.CLOSED, Severity.LOW, Priority.P1, Points.EIGHT.getPoints()),
				new Defect("ONEFDP-5664", Status.OPEN, Severity.HIGH, Priority.P3, Points.ONE.getPoints()));
	}

	private List<Story> getStoryList() {
		return Arrays.asList(new Story("ONEFDP-6574", Status.CLOSED, Points.FIVE.getPoints()),
				new Story("ONEFDP-6575", Status.CLOSED, Points.EIGHT.getPoints()),
				new Story("ONEFDP-6774", Status.OPEN, Points.THREE.getPoints()));
	}

}
