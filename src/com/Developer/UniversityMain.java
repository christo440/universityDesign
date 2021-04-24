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
                department1.getDepartment(),department1.getAddress(), department1.getNoOfStudents(),department1.getNoOfStaff()));

        department1.schoolResumptionDate();
        //department1.examdate("21-03-2022");
        department1.schoolClosingDate();
        department1.startCourseRegisteration("3rd october,2021");
        department1.endCourseDegisteration("25th october,2021");
        department1.startExamsRegistration("25th october,2021");
        department1.endOfexamRegistration("14th november,2021");

        Students student1 = new Students("Christo","1234","universitat Strasse 11",11-10-1991);
        student1.displayWelcomeAddress();
       // student1.examdate("23-03-2022");
        student1.schoolResumptionDate();
        student1.schoolClosingDate();

        System.out.println("Department of the student = " + student1.getDepartment());
        student1.nameOfStudent("lordii");
        student1.studentMatriculationNumber("1234");
        student1.StudentAddress("universitat stasse 11");
        student1.studentDateOfBirth("16th october,1991");
        student1.coursesRegistration("Math");
        student1.coursesRegistration("philosophy");
        student1.coursesRegistration("chemistry");
        student1.coursesDegistration("Economics of landuse");

        Students student2 = new Students("Mike","2234","universitat Strasse 13",11-10-1981);
        student2.displayWelcomeAddress();
        // student1.examdate("23-03-2022");
        student2.schoolResumptionDate();
        student2.schoolClosingDate();

        System.out.println("Department of the student = " + student2.getDepartment());
        student2.nameOfStudent("christian");
        student2.studentMatriculationNumber("2234");
        student2.StudentAddress("universitat stasse 13");
        student2.studentDateOfBirth("16th november,1991");
        student2.coursesRegistration("English");
        student2.coursesRegistration("philosophy");
        student2.coursesRegistration("lab work");
        student2.coursesDegistration("Economics of landuse");





    }
}
