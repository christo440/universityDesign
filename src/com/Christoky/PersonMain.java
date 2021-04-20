package com.Christoky;

public class PersonMain {
    public static void main(String[] args) {
        Person a1 = new Person();
        a1.setName("chris");
        a1.setAddress("No 51 ohanzara street");
        a1.setAge(30);
        System.out.println(String.format("%s with address %s and age: %s",a1.getName(),a1.getAddress(),a1.getAge()));
        Employee no1 = new Employee();
        no1.setSerialNumber("12345");
       no1.setAddress("dutchland");
       no1.setAge(23);
        System.out.println(String.format("%s chief with address %s aged: %s",no1.getSerialNumber(),no1.getAddress(),no1.getAge()));
    }
}
