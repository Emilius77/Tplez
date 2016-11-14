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
public class Tplez02ac_EserciziCicli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Esercizio in classe
        // Creare un programma che riceva in input i nomi delle persone che entrano in una stanza e che mi
        // restituisca l'elenco completo
        
        
        // dichiaro le variabili
        // mi preparo il materiale
        String foglio = "";     // è il mio contenitore per l'elenco dei nomi
        String input;           // è la mia stringa per chiedere input all'utente
        int num = 0;            // è la mia variabile che fungerà da contatore

        // inizializzo le variabili e chiedo input all'utente
        do {
            num++;              // faccio in modo che il contatore aumenti
            
            // chiedo chi è
            input = JOptionPane.showInputDialog("Inserire il Nominativo");

            // eseguo le operazioni
            // lo aggiungo al foglio
            if (!(input.equalsIgnoreCase("exit") || input.equals(""))) {
                //foglio = foglio + num + " - " + input + "\n";
                foglio += num + " - " + input + "\n"; // += si usa spesso per indicare che il contenitore (in questo caso foglio)
                                                // incrementa ad ogni ciclo con i valori indicati a destra (num + " - " + input + "\n";
            }

            //torno a chiedere chi è
        } while (!(input.equalsIgnoreCase("exit") || input.equals("")));   // con questa sintassi indico che l'input dell'utente
        // NON deve essere uguale a ( )
        
        // restituisco un output
        // faccio vedere il foglio
        JOptionPane.showMessageDialog(null, "Le persone entrate sono: \n" + foglio);
    }
}
