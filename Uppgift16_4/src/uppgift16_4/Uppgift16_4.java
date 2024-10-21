/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift16_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift16_4 {

    public static void main(String[] args) {

        ArrayList<Bankkonto> konto = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int val;
        int valtKonto = 0;
        System.out.println("Aktuellt konto : <Inget valt>");
        do {

            System.out.println("""
                               1. Skapa konto
                               2. V\u00e4lj konto fr\u00e5n lista
                               3. S\u00e4tt in pengar
                               4. Ta ut pengar
                               5. Avsluta program""");

            val = input.nextInt();

            if (val > 4) {
                break;
            }

            switch (val) {
                case 1 -> konto.add(nyttKonto(konto));

                case 2 -> valtKonto = valtKonto(konto);

                case 3 -> konto.set(valtKonto, insättning(konto, valtKonto));

                case 4 -> konto.set(valtKonto, uttag(konto, valtKonto));

                default -> {
                }

            }
            Bankkonto utskrift = konto.get(valtKonto);
            System.out.println("Aktuellt konto: " + utskrift);
        } while (val < 5);
    }

    static Bankkonto nyttKonto(ArrayList<Bankkonto> konto) {
        Scanner input = new Scanner(System.in);
        System.out.println(">1");
        System.out.print("Namn: ");
        String namn = input.next();

        System.out.print("Initialt saldo: ");
        double initialtSaldo = input.nextDouble();
        Bankkonto b1 = new Bankkonto(konto.size() + 1, namn, initialtSaldo, 0);
        return b1;
    }

    static int valtKonto(ArrayList<Bankkonto> konto) {
        Scanner input = new Scanner(System.in);

        System.out.println(">2");
        for (Bankkonto b2 : konto) {
            System.out.println(b2);
        }
        return input.nextInt() - 1;
    }

    static Bankkonto insättning(ArrayList<Bankkonto> konto, int valtKonto) {
        Scanner input = new Scanner(System.in);
        System.out.println(">3");
        int kontonummer = konto.get(valtKonto).kontonummer;
        String ägare = konto.get(valtKonto).ägare;
        double saldo = konto.get(valtKonto).saldo;
        System.out.print("Belopp att sätta in: ");
        double insättning = input.nextDouble();
        Bankkonto b3 = new Bankkonto(kontonummer, ägare, saldo, insättning);
        return b3;
    }

    static Bankkonto uttag(ArrayList<Bankkonto> konto, int valtKonto) {
        Scanner input = new Scanner(System.in);
        System.out.println(">4");
        int kontonummer = konto.get(valtKonto).kontonummer;
        String ägare = konto.get(valtKonto).ägare;
        double saldo = konto.get(valtKonto).saldo;
        System.out.print("Belopp att ta ut: ");
        double uttag = input.nextDouble();
        Bankkonto b4 = new Bankkonto(kontonummer, ägare, saldo, 0 - uttag);
        return b4;
    }
}
