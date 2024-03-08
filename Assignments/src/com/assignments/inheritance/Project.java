package com.assignments.inheritance;

public class Project {
    String projectName;
    int durationInMonths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationInMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationInMonths = durationInMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void getDetails(){
        System.out.println("ProjectName :"+projectName);
        System.out.println("Duration in Months :"+durationInMonths);
        System.out.println("Domin :"+domain);
        System.out.println("Project Manager :"+projectManager);
    }
}

