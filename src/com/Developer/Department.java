package com.Developer;

public class Department extends University {
    private String department;
    private int noOfStudents;
    private int noOfStaff;

    public Department(String department,int noOfStudents,int noOfStaff){
        super("Christoky","No 1 ohazara",10000,100);
        this.department = department;
        this.noOfStudents = noOfStudents;
        this.noOfStaff = noOfStaff;

    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public int getNoOfStudents() {

        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {

        this.noOfStudents = noOfStudents;
    }

    public int getNoOfStaff() {

        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {

        this.noOfStaff = noOfStaff;
    }

    public void examdate(String date){
        System.out.print("Departmental exams start on " + date);
    }
    public void startCourseRegisteration(String date){

        System.out.println("Courses registration begins on " + date);
    }
    public void endCourseDegisteration(String date){

        System.out.println("Courses degisteration ends on " + date);
    }
    public void startExamsRegistration(String date){
        System.out.println("Registration of courses for exams begins "+ date);

    }
    public void endOfexamRegistration(String date){
        System.out.println("Registration of courses for exams ends " + date);
    }

}
