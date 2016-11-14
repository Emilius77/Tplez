/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tplez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dichiaro le variabili
        String num1;
        String num2;
        int conto;
        
      // caricare i dati per ottenere il conto (input)
      num1 = JOptionPane.showInputDialog("Primo Numero Intero");
      num2 = JOptionPane.showInputDialog("Secondo Numero Intero");
            
      
      // faccio il conto totale (elaborazione)
      try {
      
      conto = Integer.parseInt(num1) + Integer.parseInt(num2);
      
      
      // stampo il conto (output)
      JOptionPane.showMessageDialog(null, conto);
      } catch (Exception errore) {
      JOptionPane.showMessageDialog(null, "scrivi meglio la prossima volta, mi hai scritto:"
       + num1 + " - " + num2);          
               
            
      }        
        
        
        
        
    }
    
}
