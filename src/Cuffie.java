import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    protected String color;
    protected boolean isWired;

    public Cuffie(int code, String name, String brand, BigDecimal price, String color, boolean isWired) {
        super(code, name, brand, price);
        this.color = color;
        this.isWired = isWired;
    }
}
