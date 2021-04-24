package com.Developer;

public class Faculty extends University {
    private String facultyName;
    private int noOfDepartments;
    private int noOfStudents;
    private int noOfStaff;
    public Faculty(String facultyName,int noOfDepartments,int noOfStudents,int noOfStaff){
        super("christoky","No 1 ohazara",10000,100);

        this.facultyName = facultyName;
        this.noOfDepartments = noOfDepartments;
        this.noOfStudents = noOfStudents;
        this.noOfStaff = noOfStaff;
    }

    public String getFacultyName()
    {
        return facultyName;
    }

    public void setFacultyName(String facultyName)
    {
        this.facultyName = facultyName;
    }

    public int getNoOfDepartments()
    {
        return noOfDepartments;
    }

    public void setNoOfDepartments(int noOfDepartments) {

        this.noOfDepartments = noOfDepartments;
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
    public void displayWelcomeAddress(){

       System.out.println("Welcome to our faculty");
   }

}
