package com.Inherit;

public class SmallBox extends Box{
    private int width;
    private int lenght;
    public SmallBox(int width,int lenght){
        super(width,lenght);
        this.width = width;
        this.lenght = lenght;
    }
    public void displayName(){
        System.out.println("I am a smallBox");
    }
    public void area(){
        double area = width * lenght;
        System.out.println(area);
    }
}
