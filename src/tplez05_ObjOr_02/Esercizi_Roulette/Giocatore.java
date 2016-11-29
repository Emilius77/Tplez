/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Roulette;

/**
 *
 * @author tss
 */
public class Giocatore {
    
    private String nome;
    private int soldi;

    
    // costruttore
    public Giocatore(String nomeGiocatore, int soldiGiocatore) {
        nome = nomeGiocatore;
        soldi = soldiGiocatore;
    }
    
    public void vince(){
        return;
    }
    
    public void perde (){
        return;
    }
    
    public void stampa(){
        System.out.println("Nome: " + nome + "\n" + "Soldi: " + soldi);
    }

    public int saldo() {
        return soldi;
    }
    
}
