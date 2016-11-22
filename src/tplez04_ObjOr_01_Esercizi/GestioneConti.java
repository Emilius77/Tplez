/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04_ObjOr_01_Esercizi;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GestioneConti {
    
    static Correntista arrcc[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creo la mia variabile per impostare il numero dei correntisti
        int numcc;
        numcc = Integer.parseInt(JOptionPane.showInputDialog("Quanti correntisti ci sono?"));
        
        // creo il mio array per contenere tutti i correntisti
        arrcc = new Correntista[numcc];
        
        // creo un ciclo per popolare il mio array
        for (int i = 0; i < arrcc.length; i++) {
            
        }
        
    
        
        
    }
    
}
