import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cuffie headset = new Cuffie(10, "HyperX Cloud II", "HyperX", new BigDecimal(300), "Red", false);

        System.out.println(headset.getIva());
    }
}
