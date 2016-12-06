/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Asta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Persona {

    private String nomePersona;
    private int soldi;
    private ArrayList<OggettoAsta> oggettiVinti;         //andiamo a crearci un ArrayList che conterrà gli oggetti vinti dalla nostra persona

    // costruttore
    public Persona(String nomePersona, int soldi) {
        this.nomePersona = nomePersona;
        this.soldi = soldi;
    }
    

    public String getNomePersona() {
        return nomePersona;
    }

    public int getSoldi() {
        return soldi;
    }

    public ArrayList<OggettoAsta> getOggettiVinti() {
        return oggettiVinti;
    }

    public Offerta nuovaOfferta() {
        //String nome = this.nomePersona;
        String nomeOggetto = JOptionPane.showInputDialog("nome oggetto - ATTENZIONE E PRECISIONE");
        String tmpValore = JOptionPane.showInputDialog("valore offerta x oggetto - ATTENZIONE E PRECISIONE");
        int valore = Integer.parseInt(tmpValore);
                
        Offerta nuovaOfferta = new Offerta(nomePersona, nomeOggetto, valore);
        return nuovaOfferta;
    }

}
