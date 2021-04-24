package com.Developer;

public class University {
    String nameOfUniversity;
    String address;
    private int noOfStudents;
    private int noOfStaff;
    public University(String nameOfUniversity,String address,int noOfStudents,int noOfStaff){
        this.nameOfUniversity = nameOfUniversity;
        this.address = address;
        this.noOfStudents = noOfStudents;
        this.noOfStaff = noOfStaff;
    }

   // public University() {

   // }

    public String getNameOfUniversity() {

        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
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

        System.out.println("Welcome to our university");
    }
    public void schoolResumptionDate(){

        System.out.println("The school resumes on 1st october 2021  ");
    }
    public void schoolClosingDate(){

        System.out.println("The school closes on 31 march,2022");
    }
}
