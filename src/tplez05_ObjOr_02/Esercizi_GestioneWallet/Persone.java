/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_GestioneWallet;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Persone {
    
    private String nome = "";
    private Wallet portafoglio = new Wallet();

    public Persone(String nome) {
        this.nome = nome;
    }
    
    public Wallet getPortafoglio() {
        return portafoglio;
    }
    
    
}
    

