package ru.raif.cources.proxy.model;

public class USATax implements TaxCalculator {
    @Override
    public double getTax(double summ) {
        return summ * 0.2;
    }
}
