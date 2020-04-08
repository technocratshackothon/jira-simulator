package com.jira.api.simulator.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectReleaseAvailableSupportService {

	public List<String> getSupportedProjects(){
		return Arrays.asList("CAI","DMSP","FDP");
	}
	
	public List<String> getSupportedRelease(String projectName){
		
		if(projectName.equalsIgnoreCase("CAI"))
		{
		return Arrays.asList("april_2020_01","april_2020_02","april_2020_03","april_2020_04");
		} else if (projectName.equalsIgnoreCase("DMSP"))
		{
		return Arrays.asList("april_2020_01","april_2020_02");
		} else if (projectName.equalsIgnoreCase("FDP"))
		{
		return Arrays.asList("march_2020_01","june_2020_02","september_2020_03","december_2020_04");
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
