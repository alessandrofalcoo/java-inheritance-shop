package org.lesson.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    protected String color;
    protected boolean isWired;

    public Cuffie(int code, String name, String brand, BigDecimal price, String color, boolean isWired,
            boolean isCard) {
        super(code, name, brand, price, isCard);
        this.color = color;
        this.isWired = isWired;
    }

    public BigDecimal discoutedCuffie() {
        if (isWired) {
            BigDecimal sconto = price.multiply(new BigDecimal("0.07"));
            BigDecimal totale = price.subtract(sconto);
            return totale;
        } else {
            return price;
        }
    }
}
