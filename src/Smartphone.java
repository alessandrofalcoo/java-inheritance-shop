import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    protected String imeiCode;
    protected int memory;

    public Smartphone(String name, String brand, BigDecimal price, String imeiCode, int memory) {
        super(name, brand, price);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }
}
