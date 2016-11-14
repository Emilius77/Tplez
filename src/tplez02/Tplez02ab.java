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
public class Tplez02ab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //------------------------------------------------------------------------
        // Esercizio in classe WHILE
        int versamento;
        int conto;
        int saldo; // saldo
        int prelievo; //versamento
        String risultato;
        String input1;

        // inizializzo le variabili
        conto = 0;

        // indico quante volte devo "ripetere" l'operazione
        int max_giri = 4;

        // indico il mio contatore
        int i = 0;

        // creo un ciclo che si ripete tante volte quanto sono i "max_giri"
        /*do
        {       // incremento il contatore ad ogni giro         
        i = i+1; //per indicare che il contatore deve incrementare si usa solitamente i++; e si usa i--; per diminuire
        
        input1 = JOptionPane.showInputDialog("Verso: (conto =" + conto+")");
        versamento = Integer.parseInt(input1);
        conto = conto + versamento;
        }        
        while (i < max_giri && versamento != 0);
        
         */
        versamento = 1;
        while (versamento > 0) {

            input1 = JOptionPane.showInputDialog("Verso: (conto =" + conto + ")");
            versamento = Integer.parseInt(input1);
            conto = conto + versamento;

        }

        prelievo = 1;

        while (prelievo > 0) {

            input1 = JOptionPane.showInputDialog("Prelevi: (conto =" + conto + ")");
            prelievo = Integer.parseInt(input1);
            conto = conto - prelievo;
        }
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
