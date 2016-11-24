/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04_ObjOr_01_Luca;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class EsaminandoLuca {

    // prima cosa elenco proprieta dell'oggetto
    String cognome;
    String nome;
    private int voto;

    public EsaminandoLuca(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    //metyodi o asbilita' delol'oggetto
    //imposta voto
    void impostaVoto(int voto) {
        if (voto >= 0 && voto <= 100) {
            this.voto = voto;
        } else {
            JOptionPane.showMessageDialog(null, "valore errato");
        }
    }

    ////leggo il voto
    int leggoVoto(){
        return voto;
    }

    String cometichiami() {
        //Dichiaro la variabile di ritorno
        String ris = "test";
        //elaboro con le mie proprieta' la frase di presentazione 
        ris = "Ciao  a tutti, mi chiamo " + nome + " " + cognome;
        //ritorno la frase
        return ris;

    }
    boolean seipiubravodi(EsaminandoLuca avversario){
    boolean ris=false;
    if (voto>avversario.leggoVoto())
        ris=true;
    return ris;
    
    }
}
