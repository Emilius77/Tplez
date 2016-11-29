/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Carte;

/**
 *
 * @author tss
 */
public class Carta {
    
    private int valore;     //numero della carta, ad esempio: 7
    private int seme;       //rappresentazione numerica del seme delle carte per le operazioni (cuori 4, quadri 3, fiori 2, picche 1)
    private String nome;    //nome del seme composto in fase di creazione, ad esempio: 7 di cuori

    public Carta(int valore, int seme, String nome) {
        this.valore = valore;
        this.seme = seme;
        this.nome = nome;
        
    }

    public int getValore() {
        return valore;
    }

    public int getSeme() {
        return seme;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
