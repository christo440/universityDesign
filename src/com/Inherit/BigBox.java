package com.Inherit;

public class BigBox extends Box {
    private int width;
    private int lenght;
    private int height;
    public BigBox(int width,int lenght,int height){
        super(width,lenght);
        this.width = width;
        this.lenght = lenght;
        this.height = height;
    }
    //public void displayName(){
   //     System.out.println("I am a Bigbox");
   // }
    public void area(){
        double area = width * lenght * height;
        System.out.println(area);
    }
}
