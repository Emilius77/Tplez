/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez03.Esercizi;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Array_Potenza2 {

    /**
     *  Esercizio in cui chiediamo due input (base ed esponente) e ci restituisce la potenza richiesta e tutte quelle precedenti
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int esponente = 0;
        int base = 0;
        String input = "";
        
        input = JOptionPane.showInputDialog("qual'è il numero di cui vuoi la potenza?");
        base = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("qual è l'esponente della potenza?");  
        esponente = Integer.parseInt(input);
        
        // voglio calcolare la potenza di un numero "base" * un numero "esponente"
        // ad esempio le potenze di due che sono: 2 4 8 16 32 etc
        // il calcolo che devo fare è: 1*2=2 - 2*2=4 - 2*8=16 (2*2*2*2) - 2*16= 32 (2*2*2*2*2)
        // quindi più facilmente posso calcolare il risultato precedente per la base 
        // 2*1=2 --> 2*2=4 --> 4*2=8 --> 8*2=16 etc
        
        
        int potenza[] = new int [esponente];
        //int risultato = 1;
        potenza[0] = base;   // dichiaro che la prima posizione libera del mio array [0] prenderà il valore del mio input "base"
        
        for (int i=1; i<esponente; i++) {      // il mio ciclo for parte dalla seconda posizione libera del mio array
            potenza[i] = potenza[i-1] * base;  // il calcolo della potenza lo esegue mettendo nel mio array il risultato precedente per il mio input "base"
        }
        // chiamo il report
        String report = "\n";    // dichiaro una variabile che userò per l'output dei dati inseriti
        for (int i=0; i<esponente; i++) {
        // ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
        report += potenza[i] + "\n";  
        
        }
        // stampo il report
        JOptionPane.showMessageDialog(null, report);
}
}
