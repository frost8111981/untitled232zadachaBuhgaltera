package com.company;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount < 100000) {
            System.out.println("Сумма меньше 100 000");
            return amount * 0.1;
        } else {
            System.out.println("Сумма больше 100 000");
            return amount * 0.15;
        }

    }
}
