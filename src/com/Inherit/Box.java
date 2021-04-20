package com.Inherit;

public class Box {
    private int width;
    private int lenght;
    public Box(int width,int lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public void displayName(){
        System.out.println("I am a Box");
    }
    public void area(){
        double area = width * lenght;
        System.out.println(area);
    }
}
