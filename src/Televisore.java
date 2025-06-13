import java.math.BigDecimal;

public class Televisore extends Prodotto {
    protected String dimensions;
    protected boolean isSmart;

    public Televisore(int code, String name, String brand, BigDecimal price, String dimensions, boolean isSmart) {
        super(code, name, brand, price);

        this.dimensions = dimensions;
        this.isSmart = isSmart;
    }
}
