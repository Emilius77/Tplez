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
public class Tplez02ab_BancomatWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conto corrente con i soldi versati o prelevati

        int conto;
        //variabile per il prelievo
        int prelievo;
        //variabile per il versamento
        int versamento;
        //variabile per input
        String input;
        // vqariabile per output
        String risultato;

        //inizializzo la situazione conto corrente a zero
        conto = 0;
        //faccio dell'input da utente

        //chiedo tot volte un versamento
        int maxgiri = 4;
        //contatore
        int i = 0;
        // creo un ciclo per tot volte = maxgiri
        do {
            //incrementare il contatore ad ogni giro
            i = i + 1;
            //i++;
            input = JOptionPane.showInputDialog("verso : (conto=" + conto + ")");
            //in input testo e lo trasformo in numero
            versamento = Integer.parseInt(input);
            conto = conto + versamento;
        } while (i < maxgiri && versamento != 0);
        /*versamento = 99999;
        while (versamento > 0) {

            input = JOptionPane.showInputDialog("verso : (conto=" + conto + ")");
            //in input testo e lo trasformo in numero
            versamento = Integer.parseInt(input);
            conto = conto + versamento;

        }
        */
        prelievo = 1;
        risultato="nessun prelievo";
        while (prelievo > 0) {
            //prelevo dal conto
            input = JOptionPane.showInputDialog("hai sul conto " + conto + "\nquanto prelevi?");
            prelievo = Integer.parseInt(input);
            //tolgo dal conto
            conto = conto - prelievo;
            //verifico cosa fare per il prelievo
            if (prelievo <= conto) { //abbastanza soldi
                
                //messagio per utente
                risultato = "Prelievo accettato:" + prelievo + "\nattuale conto: " + conto;
            } else {
                //non modifico il conto e messaggio utente
                risultato = "Prelievo impossibile:" + prelievo + "\nattuale conto: " + conto;
            }
        }

        //output finale per il prelievo
        JOptionPane.showMessageDialog(null, risultato);
    }
    
    
}
