package com.assignments.inheritance;

public class ProjectMain {
    public static void main(String[] args) {
        TeamOne teamOne = new TeamOne(
                "Policy Bazzar",
                12,
                "Banking",
                "Rahul",
                "Fullstack");

        //String[] techStack = teamOne.showTechStack();
       teamOne.getDetails();
       for(String tech:teamOne.showTechStack()){
           System.out.println(tech);
       }
       TeamTwo teamTwo = new TeamTwo(
               "Policy Bazzar",
               12,
               "Banking",
               "Rahul",
                "fullstack",
                new String[] {"Junit","Maven","Git","Docker"});

       teamTwo.showTools();

    }
}
