import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    protected String imeiCode;
    protected int memory;

    public Smartphone(int code, String name, String brand, BigDecimal price, String imeiCode, int memory) {
        super(code, name, brand, price);

        this.imeiCode = imeiCode;
        this.memory = memory;
    }
}
