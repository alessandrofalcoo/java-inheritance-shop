import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cuffie headset = new Cuffie(10, "HyperX Cloud II", "HyperX", new BigDecimal(300), "Red", false);

        Smartphone phone = new Smartphone(231, "Iphone 16 Pro Max", "Apple", new BigDecimal(1200), "3949djas92",
                "256GB");

        Televisore tv = new Televisore(200, "LG Pro ultra", "LG", new BigDecimal(750), "150x45", false);

        System.out.println(headset.getIva());
        System.out.println(phone.getName());
        System.out.println(tv.getName());
    }
}
