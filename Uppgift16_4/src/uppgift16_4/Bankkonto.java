/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uppgift16_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author einar_1yisfx7
 */
public class Bankkonto {

    ArrayList<Integer> acNumber = new ArrayList<>();
    ArrayList<String> owner = new ArrayList<>();
    ArrayList<Double> balance = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int choice;

    String a() {
        System.out.println("\n>1");
        System.out.print("Namn: ");
        String owner = input.next();
        System.out.print("Initialt saldo: ");
        double balance = input.nextDouble();
        acNumber.add(acNumber.size() + 1);
        this.owner.add(owner);
        this.balance.add(balance);
        int i = acNumber.size() - 1;
        return acNumber.get(i) + ", Ägare: " + this.owner.get(i) + ", Saldo: " + this.balance.get(i)+ "\n";
        
    }

    String b() {
        System.out.println("\n >2");
        for (String account : owner) {
            int number = 1;
            System.out.print("(" + number + ")  ");
            System.out.println(account);
            number++;
        }
        choice = input.nextInt() - 1;
        return "Du har valt konto" + "(" + acNumber.get(choice) + ")  " + owner.get(choice);
    }

    String c() {
        System.out.println("\n >3");
        var money = this.balance.get(choice);
        money += input.nextDouble();
        return "" + money;
    }

    String d() {
        System.out.println("\n >4");
        var money = this.balance.get(choice);
        money -= input.nextDouble();
        return "" + money;
    }

    public String toString(String returnValue) {
        return returnValue;
    }
}
