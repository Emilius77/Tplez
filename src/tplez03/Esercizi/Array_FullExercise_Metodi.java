/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez03.Esercizi;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilius
 */
public class Array_FullExercise_Metodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili
        int max_nomi = 0;                  // inizializzo la mia variabile che conterrà i nomi
        double gen_media = 0;
        double media = 0;
        String report = "\n";               // dichiaro una variabile che userò per l'output dei dati inseriti
        
        // creo i miei contenitori dei dati (Array nomi e voto)
        String nomi[] = new String[max_nomi];      // il mio Array nomi prenderà la grandezza assegnata alla variabile max_nomi
        int voto[] = new int[max_nomi];
        
        
        // chiedo l'input all'utente (caricamento dati)
        String input = JOptionPane.showInputDialog("Quanti presenti ci sono?");  // chiedo l'input all'utente che mi indichi quanto deve essere grande nomi
        max_nomi = Integer.parseInt(input);         // assegno alla mia variabile "max_nomi" la grandezza indica dall'input utente
        
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
        
        /*
        
        
        // inizio le varie elaborazioni necessarie (voto max, voto min, media, report)
        for (int i = 0; i < nomi.length; i++) {
             //ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
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
            for (int i = 0; i < max_nomi; i++) {
                gen_media = gen_media + voto[i];
                media = gen_media / max_nomi;
            }
            */
        
            //utilizzo un'altra procedura per fare le mie elaborazioni;
            //utilizzo un "metodo" per ottenere il valore massimo contenuto in un array di numeri
            int max = getMax(voto);  //a max assegno il valore che mi ritorna il "metodo" getMax che avrà come parametro il mio array di numeri
            int min = getMin(voto);
            media = getMedia(voto);
            
            String nomeMax;
            
            int indice = getIndexMax(voto);
            
            nomeMax = nomi[indice];

            
            // stampo il report
            JOptionPane.showMessageDialog(null, report);                //visualizzo l'output richiesto dei dati inseriti
            JOptionPane.showMessageDialog(null, "Il voto più alto è di: " + " " + nome + " " + max);  // output del voto max
            JOptionPane.showMessageDialog(null, "Il voto più basso è di: " + " " + " " +  min); // output del voto min
            JOptionPane.showMessageDialog(null, "La media dei voti è: " + " " +  media);        // output della media
            } 
    
    //creo un metodo "static" (è obbligatorio) 
    //creo metodo obbligatorio static caso particolare...
    //poi che tipo di dati deve ritornare ad esempio un numero intero .... "int" - frase... String
    //poi nome dell'azione da fare su che cosa minuscolo verbo maiuscolo oggetto dami il massimo "getMax"
    //obbligatorio le parentesi "()" con gli n parametri, anche 0 parametri da passare
    // ad esempio un array da verificare dichiaro parametro di tipo corretto (int[] valori)
    //oppure una frase (String frase) - 
    //oppure ppiu' parametri (int x, int y, int z)
    //poi le graffe per racchiudere il codice da eseguire SUBITO tutte e due
    // scrivere subito il comando di return alla fine del codice del tipo dichiarato all'inizio del metodo
    // ad esempio se ritorna un int       return  risultato;
    // dichiarare e inizializzare all'inizio del codice la varibile usato come return
    static int getIndexMax(int [] valori) {
        int risultato = 0;
        int indice = 0;
        for (int i = 0; i < valori.length; i++) {
                // guardo un numero per volta e guardo se è il maggiore
                if (valori[i] > risultato) {
                    risultato = valori[i];
                    indice = i;  //memorizzo la posizione del dato all'interno dell'array
                     }
            }
        return indice;    
    } 
    
    static int getMax(int [] valori) {
        int risultato = 0;
        for (int i = 0; i < valori.length; i++) {
                // guardo un numero per volta e guardo se è il maggiore
                if (valori[i] > risultato) {
                    risultato = valori[i];
                     }
            }
        return risultato;    
    } 
    
    static int getMin(int [] valori) {        
        int risultato = valori[0];
        for (int i = 0; i < valori.length; i++) {
                // guardo un numero per volta e guardo se è il minore
                if (valori[i] < risultato) {
                    risultato = valori[i];
                    }
            } 
    return risultato;    
    } 
    
    static int getMedia(int[] valori) {
        int risultato = 0;
        int somma = 0;
        
        for (int i = 0; i < valori.length; i++) {
                somma = somma + valori[i];
                risultato = somma + valori[i];
               }
        return risultato;    
    } 
            
}

