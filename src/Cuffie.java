import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    protected String color;
    protected boolean isWired;

    public Cuffie(int code, String name, String brand, BigDecimal price, int iva, String color, boolean isWired) {
        super(code, name, brand, price, iva);
        this.color = color;
        this.isWired = isWired;
    }
}
