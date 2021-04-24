package com.Developer;

public class UniversityMain {
    public static void main(String[] args) {
        University project = new University("Christoky","No 51 ohazara street",10000,100);
        project.displayWelcomeAddress();
        project.schoolResumptionDate();
        project.schoolClosingDate();
        System.out.println(String.format("%s is the name of the university with address: %s have the following number of staff: %s and total number of students: %s",
                project.getNameOfUniversity(),project.getAddress(),project.getNoOfStaff(),project.getNoOfStudents()));
        Faculty no1 = new Faculty("Environmental sciences",10,2000,20);
        no1.displayWelcomeAddress();
        no1.schoolResumptionDate();
        no1.schoolClosingDate();
        System.out.println(String.format("%s is the name of our university: with the following address %s: and %s is the name of the faculty having the following number of departments: %s and total number of students: %s and the following number of staff:%s",no1.getNameOfUniversity(),no1.getAddress(),
                no1.getFacultyName(),no1.getNoOfDepartments(),no1.getNoOfStudents(),no1.getNoOfStaff()));
        Department department1 = new Department("Ecology",300,25);
        department1.displayWelcomeAddress();
        System.out.println(String.format("The name of the department is %S: with the following address %s: have the following number of students %s: and the following number of staff:%s",
                department1.getDepartment(),department1.getAddress(),
                department1.getNoOfStudents(),department1.getNoOfStaff())) ;
        department1.schoolResumptionDate();
        department1.schoolClosingDate();
        department1.startCourseRegisteration("3rd october,2021");
        department1.endCourseDegisteration("25th october,2021");
        department1.startExamsRegistration("25th october,2021");
        department1.endOfexamRegistration("14th november,2021");
        department1.examdate(21-03-2022);


    }
}
