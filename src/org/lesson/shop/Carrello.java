package org.lesson.shop;

import java.math.BigDecimal;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi inserire?");
        int n = scanner.nextInt();

        scanner.nextLine();

        Prodotto[] carrello = new Prodotto[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Prodotto #" + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Prezzo: ");
            BigDecimal prezzo = scanner.nextBigDecimal();
            scanner.nextLine();

            carrello[i] = new Prodotto(i, nome, marca, prezzo);
        }

        System.out.println("Prodotti inseriti nel carrello:");
        for (Prodotto p : carrello) {
            System.out.println(p);
        }

        scanner.close();
    }

}
