package com.Encap;

public class EncapMain {
    public static void main(String[] args) {
        PracticeEncap a1 = new PracticeEncap("12345");
        a1.setName("chris");
        a1.setIdNumber("12345");
        a1.setAge(34);

        System.out.println(a1.getName() + "s age is" + a1.getAge() + "with " + a1.getIdNumber());
        a1.address = "No 51 ohazara street";
        System.out.println(a1.address);
    }
}
