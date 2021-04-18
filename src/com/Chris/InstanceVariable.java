package com.Chris;

public class InstanceVariable {
    public String name;
    public int age;
    public InstanceVariable(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
        //System.out.println(age);
    }
    public void printInfo(){
        System.out.println("name is " + name);
        System.out.println("age is " + age);
    }
}
