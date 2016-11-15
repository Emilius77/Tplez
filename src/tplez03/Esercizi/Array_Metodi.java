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
public class Array_Metodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int esponente = 0;
        // chiedo quanti numeri mi servono
        int numero = 0;
        String input = "";
        input = JOptionPane.showInputDialog("Quanti numeri vuoi inserire?");
        numero = Integer.parseInt(input);
        
        // creo array per chiedere numeri
        int elenco [] = new int [numero];
       
        // popolo il mio array
        for (int i=0; i<numero; i++) {      
            input = JOptionPane.showInputDialog("Inserire numero");  
            elenco [i] = Integer.parseInt(input);
        }
        // faccio il controllo all'interno del mio array
        int max = 0;
        for (int i= 0; i<numero; i++) {
            // guardo un numero per volta e guardo se è il maggiore
        if (elenco [i] > max) {
            max = elenco[i];
        }
        }
        
        // stampo il report
        JOptionPane.showMessageDialog(null, "Il numero più grande è: " + max);
    }
    
}
   


