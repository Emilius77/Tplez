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
public class Tplez02ae_Tabellina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili
        // mi preparo il materiale
        String foglio = "";     // è il mio contenitore per l'elenco dei nomi
        String input = "0";           // è la mia stringa per chiedere input all'utente
        int quanti = 10;
        int numero = 7;
        int valore;
        
        // prima di tutto indico quanti cicli devo fare
        
        // attivo questa parte di codice se voglio "inputare" fino a quanto contare! 
        //input = JOptionPane.showInputDialog("Tabellina fino a: ");
        //quanti = Integer.parseInt(input); // converto in numero "intero" la string input

        input = JOptionPane.showInputDialog("Di quale numero vuoi la tabellina?");
        numero = Integer.parseInt(input); // converto in numero "intero" la string input


        // inizializzo le variabili e chiedo input all'utente
        // utilizzo un ciclo FOR perchè so quanti giri deve fare il mio programma
        
        for (int i = 0; i < quanti; i++)    //dichiaro la variabile "i", le assegno il valore iniziale di "0"
                                        // indico che "i" deve essere inferiore alla variabile "quanti" dichiarata in precedenza,
                                            // indico che ad ogni giro la variabile (contatore) "i" incrementa di 1
        {
           valore = (i + 1) * numero;  // indico l'operazione che deve essere fatta
            // chiedo chi è
            //input = JOptionPane.showInputDialog("Inserire il Nominativo");

            // eseguo le operazioni
            // lo aggiungo al foglio
            foglio += numero + " x " + (i + 1) + " = " + valore + "\n"; // += si usa spesso per indicare che il contenitore (in questo caso foglio)
            // incrementa ad ogni ciclo con i valori indicati a destra ((i + 1) + " - " + input + "\n";

        }

        // restituisco un output
        // faccio vedere il foglio
        JOptionPane.showMessageDialog(null, foglio);
        
    }

    }
    

