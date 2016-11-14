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
public class Tplez02ax_Esercizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Esercizio 30
        // Determinare il minimo di due numeri A e B segnalando il caso particolare di A = B.
        // dichiaro le variabili
        int num1;
        int num2;
        String risultato;
        String input;
        
        // inizializzo le variabili
        input = JOptionPane.showInputDialog("Inserisci il primo numero");
        num1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Inserisci il secondo numero");
        num2 = Integer.parseInt(input);

        // faccio l'elaborazione
        if ((num1 > num2) && (num1 != num2)) {
            risultato = "il primo numero è maggiore del secondo";
        } else {
            if (num1 == num2) {
                risultato = "i due numeri sono uguali";
            } else {
                risultato = "il secondo numero è maggiore del primo";
            }
            }
        
    
        // faccio l'elaborazione traducendo le opzioni esattamente come le direi a voce
        // non è il modo più bello per scrivere il codice ma è molto chiaro e leggibile
        if (num1 > num2)
            risultato = "Il primo numero è maggiore del secondo";
        if (num1 < num2)
            risultato = "Il secondo numero è maggiore del primo";
        if (num1 == num2)
            risultato = "I due numeri sono uguali";

        // richiedo l'outpput
        //JOptionPane.showMessageDialog(null, risultato); questo è il metodo di stampa usando la classe JOptionPane
        System.out.println(risultato);

    }
}

