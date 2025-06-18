
import java.math.BigDecimal;

import org.lesson.shop.Cuffie;
import org.lesson.shop.Smartphone;
import org.lesson.shop.Televisore;

public class Main {
    public static void main(String[] args) {
        Cuffie headset = new Cuffie(10, "HyperX Cloud II", "HyperX", new BigDecimal(300), "Red", false, true);
        BigDecimal discoutCuffia = headset.discoutedCuffie();

        Smartphone phone = new Smartphone(231, "Iphone 16 Pro Max", "Apple", new BigDecimal(1200), "3949djas92",
                32, false);
        BigDecimal discountSmart = phone.discountedSmart();

        Televisore tv = new Televisore(200, "LG Pro ultra", "LG", new BigDecimal(750), "150x45", true, true);
        BigDecimal discountTv = tv.discountedTV();

        System.out.println(headset.getName());
        System.out.println(headset.getPrice());
        System.out.println("Prezzo scontato delle cuffie: " + discoutCuffia);

        System.out.println(phone.getName());
        System.out.println(phone.getPrice());
        System.out.println("Prezzo scontato del telefono: " + discountSmart);

        System.out.println(tv.getName());
        System.out.println(tv.getPrice());
        System.out.println("Prezzo scontato del televisore: " + discountTv);
    }
}
