import java.math.BigDecimal;

public class Televisore extends Prodotto {
    protected int dimensions;
    protected boolean isSmart;

    public Televisore(int code, String name, String brand, BigDecimal price, int iva, int dimensions, boolean isSmart) {
        super(code, name, brand, price, iva);

        this.dimensions = dimensions;
        this.isSmart = isSmart;
    }
}
