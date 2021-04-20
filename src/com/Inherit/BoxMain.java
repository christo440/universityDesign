package com.Inherit;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box(12,24);
        box1.displayName();
        box1.area();
        SmallBox box2 = new SmallBox(20,20);
        box2.displayName();
        box2.area();
        BigBox box3 = new BigBox(20,20,20);
        box3.displayName();
        box3.area();
    }
}
