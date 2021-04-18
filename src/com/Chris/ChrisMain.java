package com.Chris;

public class ChrisMain {
    public static void main(String[] args) {
        Assignment a1 = new Assignment();
        a1.getDogAge(10);
        InstanceVariable si = new InstanceVariable("chris");
        si.setAge(23);
        si.printInfo();
        System.out.println(si.name);
        System.out.println(si.age);
        StaticVariables.name = "chris";

       // System.out.println(StaticVariables.name);
       // System.out.println(StaticVariables.address);
        StaticVariables.name = "chris brown";


        System.out.println(StaticVariables.name);
        System.out.println(StaticVariables.ADDRESS);
        System.out.println(StaticVariables.ACCOUNTBALANCE);
    }
}
