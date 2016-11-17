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
        String input;
        int tot = 0;
        int max = 0;
        int min = 11;
        float media=0;
        int sommavoti = 0;
        String alunno_maggiore = "";
        String alunno_minore = "";
        
        input = JOptionPane.showInputDialog("quanti persone hanno fatto il test");
        tot = Integer.parseInt(input);   //so in tot quanto sono

        //creo due array separati per caricarci i dati nomi e voti corrispondenti
        String nomi[] = new String[tot]; //gli array vengono dichiarati dopo l'assegnazione delle altre variabili
        int voti[] = new int[tot];
        
        //passo al caricamento degli array 
        for (int i = 0; i < nomi.length; i++) {

            input = JOptionPane.showInputDialog("inserisci il nome dell'alunno");
            nomi[i] = input;

            input = JOptionPane.showInputDialog("qual'è il voto del test");
            voti[i] = Integer.parseInt(input);
        } // fine caricamento dati
        
        // utilizzo metodo per ottenere il massimo da un array di numeri
        //a max assegno il numero che mi ritorna il metofo getMax che vuole come parametro l'array 
        //in cui cercare
        max=getMax(voti);
        min=getMin(voti);
        media=getMedia(voti);
        String nomemax;
        String nomemin;
        //cerco dove' in che posizione
        int posMax=getIndexMax(voti);
        int posMin=getIndexMin(voti);
        //poi uso la posizione per recuperare il nome
        nomemax=nomi[posMax];
        nomemin=nomi[posMin];
        
        String report = "\n";
        
        //posso passare a pensare all'output
        
        //System.out.println("Lo studente col voto maggiore è: " + nomemax + "  voto: " + max);
        //System.out.println("Lo studente col voto minore è: " + nomemax + "  voto: " + min);
        //System.out.println("la media dei voti è: " + media);
        
        // inizio le varie elaborazioni necessarie (voto max, voto min, media, report)
        //for (int i = 0; i < nomi.length; i++) {
             //ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
          //  report += (i + 1) + ") " + nomi[i] + " - " + voti[i] + "\n";
        
        // stampo il report
        //    JOptionPane.showMessageDialog(null, report);                //visualizzo l'output richiesto dei dati inseriti
            JOptionPane.showMessageDialog(null, "Il voto più alto è di: " + nomemax + " voto: " + max);  // output del voto max
            JOptionPane.showMessageDialog(null, "Il voto più basso è di: " + nomemin + "  voto: " + min); // output del voto min
            JOptionPane.showMessageDialog(null, "La media dei voti è: " + media);        // output della media
        
        
        
        // dichiaro le variabili
/*        String input;
        int max_nomi = 0;                  // inizializzo la mia variabile che conterrà i nomi
        double gen_media = 0;
        double media = 0;
        String report = "\n";               // dichiaro una variabile che userò per l'output dei dati inseriti
        
        // creo i miei contenitori dei dati (Array nomi e voto)
        String nomi[] = new String [max_nomi];      // il mio Array nomi prenderà la grandezza assegnata alla variabile max_nomi
        int voto[] = new int [max_nomi];
        
        
        // chiedo l'input all'utente (caricamento dati)
        input = JOptionPane.showInputDialog("Quanti presenti ci sono?");  // chiedo l'input all'utente che mi indichi quanto deve essere grande nomi
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
        
        // inizio le varie elaborazioni necessarie (voto max, voto min, media, report)
        for (int i = 0; i < nomi.length; i++) {
             //ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
            report += (i + 1) + ") " + nomi[i] + " - " + voto[i] + "\n";
        }
    }
        
            //utilizzo un'altra procedura per fare le mie elaborazioni;
            //utilizzo un "metodo" per ottenere il valore massimo contenuto in un array di numeri
            //int maxVoto = getMax(voto);  //a max assegno il valore che mi ritorna il "metodo" getMax che avrà come parametro il mio array di numeri
            //int minVoto = getMin(voto);
            //double mediaVoto = getMedia(voto);
            
            //String nomeMax;
            //int indice = getIndexMax(voto); //cerco in che posizione (indice di array) si trova il mio valore (voto)
            //nomeMax = nomi[indice]; //poi uso la posizione per recuperare il nome

            
            // stampo il report
            JOptionPane.showMessageDialog(null, report);                //visualizzo l'output richiesto dei dati inseriti
            JOptionPane.showMessageDialog(null, "Il voto più alto è di: " + " ");  // output del voto max
            JOptionPane.showMessageDialog(null, "Il voto più basso è di: " + " "); // output del voto min
            JOptionPane.showMessageDialog(null, "La media dei voti è: " + " ");        // output della media
            }
}
        
   */ 
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

//creo metodo obbligatorio static caso particolare...
    // poi che tipo di dati deve ritornare ad esempio un numero iontero .... int - frase... String
    //poi nome dell'azione da fare su che cosa minuscolo verbo maiuscolo oggetto dami il massimo getMax
    //obbligatorio le parentesi con gli n anche 0 parametri da passare
    // ad esempio un array da verificare dichiaro parametro di tipo corretto (int[] valori)
    //oppure una frase (String frase) - 
    //oppure ppiu' parametri (int x, int y, int z)
    //poi le graffe per racchiudere il codice da eseguire SUBITO tutte e due
    // scrivere subito il comando di return alla fine del codice del tipo dichiarato all'inizio del metodo
    // ad esempio se ritorna un int       return  risultato;
    // dichiarare e inizializzare all'inizio del codice la varibile usato come return
        }
    
    
    static int getIndexMax(int[] valori) {
    int risultato=0;
    int indexMax=0;
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > risultato) {
                //caso migliore max
                risultato = valori[i];
                //salvo dove sta il migliore
                indexMax=i;
            }
        } //fine ciclo elabnorazione dati
    return indexMax;
    }
    static int getIndexMin(int[] valori) {
    int risultato=0;
    int indexMin=0;
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] < risultato) {
                //caso migliore max
                risultato = valori[i];
                //salvo dove sta il migliore
                indexMin=i;
            }
        } //fine ciclo elabnorazione dati
    return indexMin;
    }
    
    
    static int getMax(int[] valori) {
    int risultato=0;
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > risultato) {
                risultato = valori[i];
            }
        } //fine ciclo elabnorazione dati
    return risultato;
    }
    static int getMin(int[] valori) {
    int risultato;
    //risultato=999999999;
    // altro sistema piu' elegante
    //assumo che il primo sia il minore
    //e aprto inizializzato sul primo
    risultato=valori[0];
    //allora se voglio salto iol primo giro inizializzo i a 1 invece che il solito 0
    for (int i = 1; i < valori.length; i++) {
            if (valori[i] < risultato) {
                risultato = valori[i];
            }
        } //fine ciclo elabnorazione dati
    return risultato;
    }
   
static int getMedia(int[] valori) {
    int risultato;
    int somma =0;
    //li ciclo tutti e lisommo in somma
    for (int i = 0; i < valori.length; i++) {
            somma=somma+valori[i];
        } //fine ciclo elabnorazione dati
    //faccio la media
    risultato=somma/valori.length;
    
    return risultato;
    }
}

