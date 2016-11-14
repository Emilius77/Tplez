/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez02;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tplez02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //-------------------------------------------------------
        // Esercizio 20)
        // Scrivere un algoritmo che determini se N è un numero pari o dispari
        // dichiaro le variabili
        int num1;
        int risultato;
        String valore;

        String num2;
        int resto;
        String valore2;

        int num3;

        // inizializzo le variabili e chiedo input all'utente
        num1 = 3;
        num2 = JOptionPane.showInputDialog("Inserisci un numero");
        num3 = 4;

        // elaboro
        risultato = num1 % 2;
        resto = Integer.parseInt(num2) % 2;

        if (risultato == 0) {
            valore = "pari";
        } else {
            valore = "dispari";
        }

        if (resto != 0) {
            valore2 = "dispari";
        } else {
            valore2 = "pari";
        }
        // richiedo un output
        System.out.println("risultato " + num1 + " è " + valore);
        JOptionPane.showMessageDialog(null, "il numero inserito è: " + valore2);

        if (resto == 0 && num3 < 6) {
            valore = "vince pari";
        } else {
            if (resto != 0 && num3 < 6) {
                valore = "vince dispari";
            } else {
                valore = "ma che numero mi hai dato?";
            }
            System.out.println("risultato " + valore);
        }

    }

}
