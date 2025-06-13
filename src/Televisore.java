import java.math.BigDecimal;

public class Televisore extends Prodotto {
    protected int dimensions;
    protected boolean isSmart;

    public Televisore(String name, String brand, BigDecimal price, int dimensions, boolean isSmart) {
        super(name, brand, price);
        this.dimensions = dimensions;
        this.isSmart = isSmart;
    }
}
