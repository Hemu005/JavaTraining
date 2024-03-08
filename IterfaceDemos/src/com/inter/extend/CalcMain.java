package com.inter.extend;

public class CalcMain {
    public static void main(String[] args) {
        IScientific scientific = new ScientificCalci();
        scientific.add(30, 70);
        scientific.product(50, 8);
        scientific.square(25);
        scientific.cube(12);
        scientific.sub(520,360);
    }
}