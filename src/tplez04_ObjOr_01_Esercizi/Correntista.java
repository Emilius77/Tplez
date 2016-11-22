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
public class Correntista {
    
    private String nome;
    private int età;
    private double conto = 0;
    private double saldo;

    public Correntista(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }
    
    String nomeCorrentista(){
        String ris = "";
        ris = nome + " " + età;
        return ris;
    }
    
    String getInfo() {
        String ris = "Dati Correntista \n";
        ris += "nominativo: " + nome + "\n";
        ris += "conto: " + conto + "\n";
        return ris;
    }

    public void setConto(double cc) {
        //String input;
        //input = JOptionPane.showInputDialog("Imposta il saldo iniziale");
        //cc = Integer.parseInt(input);
        conto = conto + cc;
        return;
    }
    
    double getConto() {
        return conto;
    }
    
    double operazioni (){
        String input;
        double operazione;
        
        input = JOptionPane.showInputDialog("inserire il valore dell'operazione da eseguire");
        operazione = Double.parseDouble(input);
        
        if (operazione >= 0) {
            saldo = conto + operazione;
        } else {
            saldo = conto + operazione;
        }
        return saldo;
    }
    
    double getSaldo(){
        return saldo;
    }
    
}
