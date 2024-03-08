package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();

        //create a reference of IShape
        IShape shape=new Rectangle();
        //pass this as parameter
        factory.printArea(shape,10,20);

        //using anonymous inner class
        factory.printArea(new IShape(){

            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area");
                System.out.println("Tri "+(x*y*0.5));
            }
        },10,40);
        System.out.println(".............");
        //using Lambda expression
        factory.printArea((int x,int y)->{
            System.out.println("Calculating square area");
            System.out.println("Sq "+(x*y));
        },2,4);
    }
}
