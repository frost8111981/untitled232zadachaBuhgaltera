package com.company;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();

        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();



        Bill[] payments = new Bill[] { // Создаем массив счетов
                new Bill(1000, vaTaxType, taxService),  //(ск-ко потратили по счету, какой вид налога, сервис котор будет информировать// )
                new Bill(100_000, vaTaxType, taxService),
                new Bill(5_000, vaTaxType, taxService),
                new Bill(1000, incomeTaxType, taxService),  //(ск-ко потратили по счету, какой вид налога, сервис котор будет информировать// )
                new Bill(100_000, vaTaxType, taxService),
                new Bill(5_000, progressiveTaxType, taxService)
        };

        for (int i = 0; i < payments.length; ++i) { // Пробегаем циклом по счетам
            Bill bill = payments[i];
            bill.payTaxes(); // Вычесляет количество необходимого налога + уведомляет ск-ко налога надо заплатить
        }

    }
}
