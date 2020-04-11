package com.jira.api.simulator.service;

import java.util.*;

import com.jira.api.simulator.entity.Application;
import org.springframework.stereotype.Service;

@Service
public class ProjectReleaseAvailableSupportService {

	public List<String> getSupportedProjects(){
		return Arrays.asList("CAI","DMSP","FDP");
	}

	public List<Application> getSupportedProjectsAndReleasemMap(){
		List<Application> applicationList = new ArrayList<>();
		Arrays.asList("CAI","DMSP","FDP").forEach(t->{
			List<Map<String,String>> releasesAvailable = new ArrayList<>();
			Application a = new Application();
			a.setName(t);
			getSupportedRelease(t).forEach(release->{
				Map<String,String> mapper = new HashMap<>();
				mapper.put("releaseName",release);
				releasesAvailable.add(mapper);
			});
			a.setReleasesAvailable(releasesAvailable);
			applicationList.add(a);

		});
		return applicationList;
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
