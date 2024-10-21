/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uppgift16_4;

/**
 *
 * @author einar.salamon
 */
public class Bankkonto {
    int kontonummer;
    String ägare;
    double saldo;

    
    public Bankkonto(int kontonummer, String ägare, double saldo, double ändring) {
        this.kontonummer = kontonummer;
        this.ägare = ägare;
        this.saldo = saldo + ändring;   
    }
        
 
    
    public String toString(){
        return "(" + kontonummer + ", Ägare: " + ägare + ", Saldo: " + saldo + ")"; 
    } 
}
