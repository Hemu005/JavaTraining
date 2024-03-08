package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator=new CalculatorImpl();
        bonusCalculator.calculate(2000);
        bonusCalculator.policyType();
        IBonusCalculator.show();//static method calling using interface

        System.out.println();

        IAllowanceCalculator allowace = (IAllowanceCalculator) bonusCalculator;
        allowace.calculate(1000);
        allowace.policyType();
    }
}
