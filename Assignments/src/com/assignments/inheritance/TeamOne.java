package com.assignments.inheritance;

public class TeamOne extends Project {
    String techStack;

    public TeamOne(String projectName, int durationInMonths, String domain, String projectManager, String techStack) {
        super(projectName, durationInMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
        String[] skills={"Java","Python","Dot Net","HTML"};
                return skills;
    }
}
