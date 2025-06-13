import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cuffie headset = new Cuffie("HyperX Cloud II", "HyperX", new BigDecimal(100), "Green", false);

        System.out.println(headset.getName());
    }
}
