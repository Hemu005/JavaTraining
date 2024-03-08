package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator myCalculator = (int x, int y) -> {
            return x + y;
        };
        System.out.println("Addition of two number :"+myCalculator.calculator(10,20));

        myCalculator=(x,y)->x-y;
        System.out.println("Addition of two number :"+myCalculator.calculator(23,20));

        myCalculator=(x,y)->x*y;
        System.out.println("Multiplication of two number :"+myCalculator.calculator(23,20));

        myCalculator=(x,y)->x/y;
        System.out.println("Division of two number :"+myCalculator.calculator(10,2));

    }
}
