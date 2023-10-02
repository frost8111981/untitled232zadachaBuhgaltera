package com.company;

public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = taxType.calculateTaxFor(amount); // Вычесляет количество необходимого налога
        taxService.payOut(taxAmount); // Уведомляет ск-ко налога надо заплатить
    }
}
