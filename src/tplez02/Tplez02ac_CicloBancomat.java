/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez02;

import javax.swing.*;


/**
 *
 * @author tss
 */
public class Tplez02ac_CicloBancomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Esercizio in classe
        // Istruzioni per chiedere input all'utente per chiedere di inserire un
        // codice e verificarne l'esattezza per continuare con il programma o uscire
        boolean ancora = true;
        String input;
        String codice_uscita = "0000";
        String codice_ingresso = "007";
        int conto_bancomat = 0;
        
        do {  // qui inseriamo il codice che esegue le istruzioni per l'utente
            input = JOptionPane.showInputDialog("Inserire il codice d'accesso oppure 0000 per uscire");

            // inseriemo le istruzioni che verificano il codice precedente
            // questo è l'istruzione che designamo come codice d'uscita
            if (input.equals(codice_uscita)) {
                ancora = false;
            } else {
                if (input.equals(codice_ingresso)) { // qui farà le operazioni del caso
                    JOptionPane.showMessageDialog(null, "codice valido");
                    
                   // con queste due righe di codice andiamo ad immettere della
                   // liquidità iniziale
                    String liquidità = JOptionPane.showInputDialog("con quanto parte la cassa?");  
                    conto_bancomat = Integer.parseInt(liquidità);  
                    JOptionPane.showMessageDialog(null, "La liquidità iniziale del bancomat è: " + conto_bancomat);
                    
                    
                    // dichiaro la variabile booleana che mi permetterà l'esecuzione del ciclo seguente
                    boolean altre_operazioni = true;  // specifico che alla partenza, la variabile "altre_operazioni" avrà valore true
                    while (altre_operazioni == true) // il ciclo continuerà fino a che la variabile sarà verificata
                    {  
                        String risultato = "cosa mi hai chiesto? Riprova";

                        // il primo input da chiedere è quale operazione vogliamo fargli fare
                        // in questo caso V, P o X (Versamento, Prelievo o Uscita)
                        input = JOptionPane.showInputDialog("Quale operazione vuoi eseguire? V - P - X");
                        // Ora specifico le operazioni che il programma farà in base alla scelta
                        if (input.equalsIgnoreCase("X")) // non fa differenza tra Maiuscole e minuscole
                        {
                            altre_operazioni = false;
                            risultato = "Arrivederci";
                        }

                        if (input.equalsIgnoreCase("V")) // non fa differenza tra Maiuscole e minuscole
                        {
                            input = JOptionPane.showInputDialog("verso : (conto=" + conto_bancomat + ")");
                            //in input testo e lo trasformo in numero
                            int versamento = Integer.parseInt(input);
                            conto_bancomat = conto_bancomat + versamento;
                            risultato = "Versamento effettuato: " + versamento + "\nattuale conto: " + conto_bancomat;
                        }

                        if (input.equalsIgnoreCase("P")) // non fa differenza tra Maiuscole e minuscole
                        {                            
                            input = JOptionPane.showInputDialog("hai sul conto " + conto_bancomat + "\nquanto prelevi?");
                            int prelievo = Integer.parseInt(input);
                            //tolgo dal conto
                            conto_bancomat = conto_bancomat - prelievo;
                            //verifico cosa fare per il prelievo
                            if (prelievo <= conto_bancomat) { //abbastanza soldi

                                //messagio per utente
                            risultato = "Prelievo accettato:" + prelievo + "\nattuale conto: " + conto_bancomat;
                            } else {
                                //non modifico il conto e messaggio utente
                            risultato = "Prelievo impossibile:" + prelievo + "\nattuale conto: " + conto_bancomat;
                            }
                        }
                        // ogni volta che faccio un'operazione ne faccio vedere il risultato
                        JOptionPane.showMessageDialog(null, risultato);

                    } // fine del ciclo while altre_operazioni

                } else { // qui darà un input di risposta
                    JOptionPane.showMessageDialog(null, "codice errato, ritenta (dopo 5 tentativi si spegnerà tutto)");
                }
            }

        } while (ancora == true);
    }
}
