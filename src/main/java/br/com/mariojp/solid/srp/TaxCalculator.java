package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public double calculateTax(double subtotal) {
        String taxRateStr = System.getProperty("tax.rate", "0.10"); 
        double taxRate = Double.parseDouble(taxRateStr);
        return subtotal * taxRate;
    }
}
