package com.RedUniversity;

import java.util.ArrayList;

public class University<Student, Staff> {
    private String name;
    private String address;
    ArrayList<Student> students;
    ArrayList<Staff> staffs;
    public University(String name,String address,Student students,Staff staffs){
        this.name = name;
        this.address = address;
        this.students = (ArrayList<Student>) students;
        this.staffs = (ArrayList<Staff>) staffs;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }
}
