/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04_ObjOr_01_Esercizi;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili da utilizzare
        String output;
        String outputSaldo;
        
        
        Correntista cc1 = new Correntista("Gianni", 35);
        cc1.setConto(0);
        
        Correntista cc2 = new Correntista("Laura", 42);
        cc2.setConto(0);
        
        output = cc1.getInfo() + cc2.getInfo();
        System.out.println(output);
        
        cc1.operazioni();
        cc2.operazioni();
        
        outputSaldo = "saldo aggiornato \n" + cc1.nomeCorrentista() + " " + cc1.getSaldo() + " \n" + cc2.nomeCorrentista() + " " + cc2.getSaldo();
        System.out.println(outputSaldo);
    }
    
}
