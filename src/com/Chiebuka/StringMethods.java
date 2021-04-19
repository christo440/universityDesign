package com.Chiebuka;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "students";
        String s3 = "school";
        String s4 = "life";
        String s5 = "    chris    ";
        String s6 = "";
        System.out.println(s1.length());
        System.out.println(s1.concat(s2));
       System.out.println(s1.contains("hello"));
        System.out.println(s1.compareToIgnoreCase("hello"));
       System.out.println(s1.toLowerCase());
       System.out.println(s1.equalsIgnoreCase("hello world"));
       System.out.println(s1.isEmpty());
    }
}
