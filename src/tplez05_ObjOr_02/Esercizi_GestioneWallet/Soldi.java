/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_GestioneWallet;

/**
 *
 * @author tss
 */
public class Soldi {
    
    private double valore;     //numero del soldo, ad esempio: 7
    private String nome;    //nome del seme composto in fase di creazione, ad esempio: 7 di euro

    //creo il costruttore che mi indichi con quali parametri devo creare il mio oggetto
    public Soldi(double valore, String nome) {      //costruttore
        this.valore = valore;
        this.nome = nome;
    }

    public double getValore() {
        return valore;
    }

    public String getNome() {
        return nome;
    }

    void add(Soldi valore) {
        
    }

}
