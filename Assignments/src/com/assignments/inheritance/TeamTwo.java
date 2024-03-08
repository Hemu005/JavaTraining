package com.assignments.inheritance;

public class TeamTwo extends TeamOne{
    String[] tools;

    public TeamTwo(String projectName, int durationInMonths, String domain, String projectManager, String techStack, String[] tools) {
        super(projectName, durationInMonths, domain, projectManager, techStack);
        this.tools = tools;
    }

    void showTools(){
        for(String tool:tools){
            System.out.println(tool);
        }
    }
}
