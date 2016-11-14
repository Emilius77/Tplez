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
public class Tplez02a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //------------------------------------------------------------------------
        // Esercizio in classe IF () THEN ... ELSE ...
        // Creare un programma che dopo la richiesta di 4 input di "versamento"
        // richieda 1 input di "prelievo". A questo punto il programma ci deve dire
        // se possiamo effettuare o meno il prelievo.
        
        int versamento;
        //int num2;
        //int num3;
        //int num4;
        int conto;
        int saldo; // saldo
        int prelievo; //versamento
        String risultato;
        String input1;
        //String input2;
        //String input3;
        //String input4;
        //String input5;
        
        // inizializzo le variabili
        conto = 0;
        
        input1 = JOptionPane.showInputDialog("Primo versamento");
        versamento = Integer.parseInt(input1);
        conto = conto + versamento;
        
        input1 = JOptionPane.showInputDialog("Secondo versamento");
        versamento = Integer.parseInt(input1);
        conto = conto + versamento;
        
        input1 = JOptionPane.showInputDialog("Terzo versamento");
        versamento = Integer.parseInt(input1);
        conto = conto + versamento;
        
        input1 = JOptionPane.showInputDialog("Quarto versamento");
        versamento = Integer.parseInt(input1);
        conto = conto + versamento;
        
        input1 = JOptionPane.showInputDialog("Quanto vuoi prelevare?");
        prelievo = Integer.parseInt(input1);
        
        //risultato = null;

        // faccio l'elaborazione
        
        //conto = conto + num1 + num2 + num3 + num4;  //ottengo il totale dei versamenti
        saldo = conto - prelievo;                 //ottengo il saldo
        
        if (conto > prelievo) {
            risultato = "Hai prelevato " + prelievo + " il tuo saldo attuale è di: " + saldo;
        } else {
            risultato = "Non hai abbastanza liquidità sul conto per eseguire il prelievo";
            }
            
           
        // faccio l'elaborazione traducendo le opzioni esattamente come le direi a voce
        // non è il modo più bello per scrivere il codice ma è molto chiaro e leggibile
        /*if (num1 > num2)
            risultato = "Il primo numero è maggiore del secondo";
        if (num1 < num2)
            risultato = "Il secondo numero è maggiore del primo";
        if (num1 == num2)
            risultato = "I due numeri sono uguali";*/

        // richiedo l'outpput
        JOptionPane.showMessageDialog(null, risultato); //questo è il metodo di stampa usando la classe JOptionPane
        //System.out.println(risultato);

    }
    
}
