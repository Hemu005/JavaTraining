package com.inter.lam;

public class ShapeDemo{
    public static void main(String[] args) {

        IShape shape = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area "+(x*y));
            }
        };
        shape.area(10,20);
        System.out.println();

        IShape shape1=new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area of square "+(x*y));
            }
        };
        shape1.area(20,30);
    }
}