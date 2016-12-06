/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Asta;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tss
 */
public class ElencoOggettiAsta {

    //andiamo a crearci un ArrayList che conterrà l'elenco dei nostri oggetti
    private String nomeAsta;
    private ArrayList<OggettoAsta> elencoOggetti = new ArrayList<OggettoAsta>();

    //andiamo a creare il metodo che ci permette di aggiungere all'arraylist "elencoOggetti" l'oggetto generato
    public void addOggettoAsta(OggettoAsta o) {
        elencoOggetti.add(o);
    }

}
