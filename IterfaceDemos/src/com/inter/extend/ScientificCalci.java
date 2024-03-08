package com.inter.extend;

public class ScientificCalci extends BasicCalculator implements IScientific {
    @Override
    public void square(int x) {
        System.out.println("squre :"+(Math.pow(x,2)));
    }

    @Override
    public void cube(int x) {
        System.out.println("Cube :"+(Math.pow(x,3)));
    }
}
