package com.Developer;

public class Students extends Department {
    private String name;
    private String matriculationNo;
    private String address;
    private int dateOfBirth;
    public Students(String name,String matriculationNo, String address,int dateOfBirth){
        super("Ecology",300,25);
        this.name = name;
        this.matriculationNo = matriculationNo;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public void nameOfStudent(String name){
        System.out.println("Student name = " + name);
    }
    public void studentMatriculationNumber(String matriculationNo){
        System.out.println("Student matriculation number = " + matriculationNo);
    }
    public void StudentAddress(String address){
        System.out.println("Student address = " + address);
    }
    public void studentDateOfBirth(String dateOfBirth){
        System.out.println("Student date of birth = " + dateOfBirth);
    }
    public void coursesRegistration(String course){
        System.out.println("registered course for the semester  = " + course);
    }
    public void coursesDegistration(String course){
        System.out.println("Deregistered course for the semester = " + course);}
}
