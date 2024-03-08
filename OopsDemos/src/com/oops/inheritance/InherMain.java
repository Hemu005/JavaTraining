package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("Hemu",04);
        inEmployee.getDetails();

        InManager inManager = new InManager("Gowda",05,2000);
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}
