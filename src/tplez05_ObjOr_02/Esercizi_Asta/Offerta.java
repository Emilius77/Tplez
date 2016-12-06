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
public class Offerta {
    
    private String nomePersona;
    private String nomeOggetto;
    private int valore;

    public Offerta(String nomePersona, String nomeOggetto, int valore) {
        this.nomePersona = nomePersona;
        this.nomeOggetto = nomeOggetto;
        this.valore = valore;
    }

    public String getNomePersona() {
        return nomePersona;
    }

    public String getNomeOggetto() {
        return nomeOggetto;
    }

    public int getValore() {
        return valore;
    }
    
    
    

    
    
}
