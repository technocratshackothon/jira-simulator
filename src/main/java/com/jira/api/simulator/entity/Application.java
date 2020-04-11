package com.jira.api.simulator.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by vikas on 12-04-2020.
 */
public class Application {
    private String name;
    private List<Map<String,String>> releasesAvailable;

    public Application() {
    }

    public Application(String name, List<Map<String, String>> releasesAvailable) {
        this.name = name;
        this.releasesAvailable = releasesAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<String, String>> getReleasesAvailable() {
        return releasesAvailable;
    }

    public void setReleasesAvailable(List<Map<String, String>> releasesAvailable) {
        this.releasesAvailable = releasesAvailable;
    }
}
