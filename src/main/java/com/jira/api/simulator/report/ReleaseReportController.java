package com.jira.api.simulator.report;

import java.util.List;

import com.jira.api.simulator.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jira.api.simulator.entity.ReleaseReport;
import com.jira.api.simulator.service.ProjectReleaseAvailableSupportService;
import com.jira.api.simulator.service.ReleaseDetailsService;

@RestController
public class ReleaseReportController {

	@Autowired
	private ReleaseDetailsService releaseDetailsService;
	@Autowired
	private ProjectReleaseAvailableSupportService support;
	
	@RequestMapping("/releasedetail/{projectname}/{releaseversion}")
	public ReleaseReport getReleaseReport(@PathVariable String projectname, @PathVariable String releaseversion){
		return releaseDetailsService.getReleaseDetails(projectname, releaseversion);
	}
	
	@RequestMapping("/projectsupport")
	public List<Application> getSupportedProject(){
		return support.getSupportedProjectsAndReleasemMap();
	}
	
	@RequestMapping("/releasesupport/{projectname}") 
	public List<String> getSupportedRelease(@PathVariable String projectname){
		return support.getSupportedRelease(projectname);
	}
	
}
