package com.jira.api.simulator.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectReleaseAvailableSupportService {

	//private static final String FILEPATH_AVAILABLE_PROEJCT_RELEASE_DATA = "";
	private final Map<String, List<String>> supportMap;
	
	public ProjectReleaseAvailableSupportService(){
		this.supportMap = new HashMap<String, List<String>>();
		loadSupportMap();
	}
	
	private void loadSupportMap() {
		System.out.println("Executing loadSupportMap method");
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("/project_release_support.txt");
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
	        while (reader.ready()) {
	            String line = reader.readLine();
	            System.out.println(line);
	        }
	    }catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		
		
	}

	public List<String> getSupportedProjects(){
		return Arrays.asList("CAI","DMSP","FDP");
	}
	
	public List<String> getSupportedRelease(String projectName){
		return null;
	}
}
