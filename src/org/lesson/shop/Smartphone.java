package org.lesson.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    protected String imeiCode;
    protected String memory;

    public Smartphone(int code, String name, String brand, BigDecimal price, String imeiCode, String memory) {
        super(code, name, brand, price);

        this.imeiCode = imeiCode;
        this.memory = memory;
    }
}
