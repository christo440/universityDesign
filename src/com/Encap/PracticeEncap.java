package com.Encap;

public class PracticeEncap {
    public String name;
    private String idNumber;
    private int age;
    String address;
    public PracticeEncap(String idNumber){
        this.idNumber = idNumber;
    }
   // public PracticeEncap(String name){
      //  this.name = name;
    //}

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;

    }

    public void setAge(int age) {
        this.age = age;

    }
}
