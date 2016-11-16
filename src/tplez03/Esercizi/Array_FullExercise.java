/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez03.Esercizi;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilius
 */
public class Array_FullExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int max_nomi = 0;                           // inizializzo la mia variabile che conterrà i nomi
        
        String input = JOptionPane.showInputDialog("Quanti presenti ci sono?");  // chiedo l'input all'utente che mi indichi quanto deve essere grande nomi
        max_nomi = Integer.parseInt(input);         // assegno alla mia variabile "max_nomi" la grandezza indica dall'input utente
        
        
        //input = JOptionPane.showInputDialog("Quanti voto ha?");
        String nomi[] = new String[max_nomi];      // il mio Array nomi prenderà la grandezza assegnata alla variabile max_nomi
        int voto[] = new int[max_nomi];

        for (int i = 0; i < nomi.length; i++) {
            // devo chiedere il nome e caricarlo nella scatola corretta
            int mancano = nomi.length - i;                          // dichiaro una variabile "mancano" che mi restituisca una sorta di conto alla rovescia basandosi
            // sulla grandezza del mio array - il numero di indice che ho scritto
            input = JOptionPane.showInputDialog("Nome [-" + mancano + "]");     // chiedo input all'utente per popolare il mio array
            nomi[i] = input;                                            // indico al programma che deve assegnare il mio input al mio array seguendo l'indice
            // che viene incrementato ad ogni giro del mio programma

            input = JOptionPane.showInputDialog("Voto [-" + mancano + "]");     // chiedo input all'utente per popolare il mio array
            voto[i] = Integer.parseInt(input);                                  // indico al programma che deve assegnare il mio input al mio array seguendo l'indice
            // che viene incrementato ad ogni giro del mio programma
        }
        String report = "\n";    // dichiaro una variabile che userò per l'output dei dati inseriti
        for (int i = 0; i < nomi.length; i++) {
            // ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
            report += (i + 1) + ") " + nomi[i] + " - " + voto[i] + "\n";
        }
            // faccio il controllo all'interno del mio array
            int max = 0;
            String nome = nomi[0];
            for (int i = 0; i < max_nomi; i++) {
                // guardo un numero per volta e guardo se è il maggiore
                if (voto[i] > max) {
                    max = voto[i];
                    nome = nomi[i];
                }
            }
               
            int min = voto[0];
            String nome1 = nomi[0];
            for (int i = 0; i < max_nomi; i++) {
                // guardo un numero per volta e guardo se è il minore
                if (voto[i] < min) {
                    min = voto[i];
                    nome1 = nomi[i];
                }
            }
            // qui andrò a scrivere il codice per calcolare la media di tutti i voti inseriti
            
            int media = 0;
            media = ((voto[0] + voto [1] + voto[2]) / max_nomi);
            
            // stampo il report
            JOptionPane.showMessageDialog(null, report);        //visualizzo l'output richiesto
            JOptionPane.showMessageDialog(null, "Il voto più alto è di: " + " " + nome + " " + max);
            JOptionPane.showMessageDialog(null, "Il voto più basso è di: " + " " + nome1 + " " +  min);
            JOptionPane.showMessageDialog(null, "La media dei voti è: " + " " +  media);
            
        } 
    }

