import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    protected String color;
    protected boolean isWired;

    public Cuffie(String name, String brand, BigDecimal price, String color, boolean isWired) {
        super(name, brand, price);
        this.color = color;
        this.isWired = isWired;
    }
}
