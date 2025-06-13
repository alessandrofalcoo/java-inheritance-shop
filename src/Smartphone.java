import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    protected String imeiCode;
    protected int memory;

    public Smartphone(int code, String name, String brand, BigDecimal price, int iva, String imeiCode, int memory) {
        super(code, name, brand, price, iva);

        this.imeiCode = imeiCode;
        this.memory = memory;
    }
}
