/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez03.Esercizi;

import tplez03.*;
import javax.swing.JOptionPane;

/**
 *  Lezione sugli ARRAY
 *
 * @author tss
 */
public class Array_NomeEta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int max_nomi = 0;                           // inizializzo la mia variabile che conterrà i nomi
        String input = JOptionPane.showInputDialog("Quanti presenti ci sono?");  // chiedo l'input all'utente che mi indichi quanto deve essere grande nomi
        max_nomi = Integer.parseInt(input);         // assegno alla mia variabile "max_nomi" la grandezza indica dall'input utente
        
        //int età = 0;
        //input = JOptionPane.showInputDialog("Quanti anni ha?");
        
        String nomi[] = new String [max_nomi];      // il mio Array nomi prenderà la grandezza assegnata alla variabile max_nomi
        int anni[] = new int [max_nomi];
        
        for (int i=0; i<nomi.length; i++) {
            // devo chiedere il nome e caricarlo nella scatola corretta
            int mancano = nomi.length - i;                          // dichiaro una variabile "mancano" che mi restituisca una sorta di conto alla rovescia basandosi
                                                                    // sulla grandezza del mio array - il numero di indice che ho scritto
            input = JOptionPane.showInputDialog("Come ti chiami? [-" + mancano + "]");     // chiedo input all'utente per popolare il mio array
            nomi[i] = input;                                            // indico al programma che deve assegnare il mio input al mio array seguendo l'indice
                                                                        // che viene incrementato ad ogni giro del mio programma
                                                                        
            input = JOptionPane.showInputDialog("Quanti anni hai? [-" + mancano + "]");     // chiedo input all'utente per popolare il mio array
            anni[i] = Integer.parseInt(input);                                            // indico al programma che deve assegnare il mio input al mio array seguendo l'indice
                                                                        // che viene incrementato ad ogni giro del mio programma
        
        }
       
        String report = "\n";    // dichiaro una variabile che userò per l'output dei dati inseriti
        for (int i=0; i<nomi.length; i++) {
        // ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
        report += (i+1) + ") " + nomi[i] + " - " + anni[i] +  "\n";
        
        }
        JOptionPane.showMessageDialog(null, report);        //visualizzo l'output richiesto

                    
        
        
        
        
        
        
    }
    
} 

