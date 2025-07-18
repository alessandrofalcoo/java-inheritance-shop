package org.lesson.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    protected String imeiCode;
    protected int memory;

    public Smartphone(int code, String name, String brand, BigDecimal price, String imeiCode, int memory,
            boolean isCard) {
        super(code, name, brand, price, isCard);

        this.imeiCode = imeiCode;
        this.memory = memory;
    }

    public BigDecimal discountedSmart() {
        if (memory < 32) {
            BigDecimal sconto = price.multiply(new BigDecimal("0.05"));
            BigDecimal totale = price.subtract(sconto);
            return totale;
        } else {
            BigDecimal sconto = price.multiply(new BigDecimal("0.02"));
            BigDecimal totale = price.subtract(sconto);
            return totale;
        }
    }
}
