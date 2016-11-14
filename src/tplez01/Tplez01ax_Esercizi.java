/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tplez01ax_Esercizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Esercizio 1)
        // Scrivere un algoritmo che calcoli e visualizzi in output la differenza D di due numeri
        // A e B richiesti in input all'utente
        
        
        //dichiaro le variabili
        String num1;
        String num2;
        int conto;

        // caricare i dati per ottenere il conto (input)
        num1 = JOptionPane.showInputDialog("Primo Numero Intero");
        num2 = JOptionPane.showInputDialog("Secondo Numero Intero");

        conto = Integer.parseInt(num1) - Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, conto);

        // -----------------------------------------------------------------
        // Esercizio 2)
        // Scrivere un algoritmo che realizzi lo scambio dei valori di due variabili A e B
        // chieste in input all'utente e visualizzi il nuovo valore delle due variabili
        
        
        //dichiaro le variabili
        // caricare i dati per ottenere il conto (input)
        num1 = JOptionPane.showInputDialog("Primo Numero Intero");
        num2 = JOptionPane.showInputDialog("Secondo Numero Intero");

        JOptionPane.showMessageDialog(null, "Il primo numero inserito è: " + num2);
        JOptionPane.showMessageDialog(null, "Il secondo numero inserito è: " + num1);

        //------------------------------------------------------------------
        // Esercizio 3)
        // Realizzare un algoritmo che simuli il funzionamento di un Euro convertitore
        
        final double Euro = 1936.27;
        double conversione;
        
        num1 = JOptionPane.showInputDialog("Inserisci il valore in LIRE");
        

        conversione = Integer.parseInt(num1) / Euro;
        conversione = Math.round(conversione * 100);
        conversione = conversione / 100;

        JOptionPane.showMessageDialog(null, "Il valore in EURO è: " + conversione);

    }
    
    
    

}
