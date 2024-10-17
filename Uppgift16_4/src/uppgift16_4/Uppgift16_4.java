/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift16_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author einar_1yisfx7
 */
public class Uppgift16_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val;

        do {         
            System.out.println(
                    "1. Skapa konto\n"
                    + "2. Välj konto från lista\n"
                    + "3. Sätt in pengar\n"
                    + "4. Ta ut pengar\n"
                    + "5. Avsluta program");
            val = input.nextInt();
            if(val > 4) continue;
            valtAlternativ(val);
        } while (val < 5);
        System.out.println("avslutar programmet");
    }
    
    
static void valtAlternativ(int val){
     Scanner input = new Scanner(System.in);
    Bankkonto bk = new Bankkonto();
    String valet [] = {bk.a(), bk.b(), bk.c(), bk.d()};
    System.out.println(valet[val-1]);
}
   

}
