import java.math.BigDecimal;

public class Prodotto {
    protected int code;
    protected String name;
    protected String brand;
    protected BigDecimal price;
    protected int iva = 22;

    public Prodotto(int code, String name, String brand, BigDecimal price) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;

    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}
