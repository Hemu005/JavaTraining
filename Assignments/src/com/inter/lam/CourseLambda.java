package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse iCourse=()->{
            System.out.println("Frontend:");
            String[] frontend={"html","css","bootstrap"};
                    return frontend;
        };
        for(String course:iCourse.showCourses()){
            System.out.println(course);
        }

        iCourse=()->new String[]{"aws","googlecloud","azure"};
        System.out.println("Cloud:");
        for(String course:iCourse.showCourses()){
            System.out.println(course);
        }

        iCourse=()->{
            System.out.println("FullStack:");
            String[] fullstack={"java","spring","junit"};
            return fullstack;
        };
        for(String course:iCourse.showCourses()){
            System.out.println(course);
        }
    }
}
