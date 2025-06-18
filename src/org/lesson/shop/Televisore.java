package org.lesson.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    protected String dimensions;
    protected boolean isSmart;

    public Televisore(int code, String name, String brand, BigDecimal price, String dimensions, boolean isSmart,
            boolean isCard) {
        super(code, name, brand, price, isCard);

        this.dimensions = dimensions;
        this.isSmart = isSmart;
    }

    public BigDecimal discoutedTV() {
        if (!isSmart) {
            BigDecimal sconto = price.multiply(new BigDecimal("0.10"));
            BigDecimal totale = price.subtract(sconto);
            return totale;
        } else {
            return price;
        }
    }
}
