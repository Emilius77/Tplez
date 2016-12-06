/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Asta;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class OggettoAsta {
    
    private String nomeOggetto;
    private int costoBase;
    private ArrayList<Offerta> offerteAsta;         //andiamo a crearci un ArrayList che conterrà le offerte per i nostri oggetti
    
    
    //costruttore

    public OggettoAsta(String nomeOggetto, int costoBase) {
        this.nomeOggetto = nomeOggetto;
        this.costoBase = costoBase;
    }

    public String getNomeOggetto() {
        return nomeOggetto;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public ArrayList<Offerta> getOfferteAsta() {
        return offerteAsta;
    }
    
    
   
    
    
}
