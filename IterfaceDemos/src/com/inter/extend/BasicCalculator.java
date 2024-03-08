package com.inter.extend;

public class BasicCalculator implements ICalculator {
    @Override
    public void add(int x, int y) {
          int sum=x+y;
        System.out.println("Sum of x and y :"+sum);
    }

    @Override
    public void product(int x, int y) {
        int pro=x*y;
        System.out.println("Product of x and y :"+pro);
    }
}
