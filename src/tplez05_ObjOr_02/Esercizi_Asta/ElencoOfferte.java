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
public class ElencoOfferte {
    
    private String nomeListaOfferte;
    private ArrayList<Offerta> elencoOfferte;

    //andiamo a crearci un ArrayList che conterrà l'elenco delle nostre offerte
    public ElencoOfferte() {
        elencoOfferte = new ArrayList <Offerta>();      
    }
    
    //andiamo a creare il metodo che ci permette di aggiungere all'arraylist "elencoOfferte" l'offerta generata
    public void addOfferta(Offerta o) {         
        elencoOfferte.add(o);
    }
    
    
    
}
