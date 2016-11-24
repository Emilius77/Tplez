/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04_ObjOr_01;

import javax.swing.JOptionPane;

/**
 *
 * Classe Esaminando - richiamata nel main
 *
 * @author tss
 */
public class Esaminando {

    // queste sono le variabili definite "proprietà" della classe / oggetto
    String cognome;
    String nome;
    private int voto;

    public Esaminando(String cognome, String nome) { // creo il "costruttore" che avrà lo stsso nome della classe e che mi forzerà, durante la creazione di 
        this.cognome = cognome;                     // un nuovo oggetto, a passargli le proprietà specificate
        this.nome = nome;
    }
    
    // metodi ed abilità dell'oggetto (classe Esaminando)
    // metodo per impostare il voto
    void impostaVoto(int voto) {
        if (voto >= 0 && voto <= 100) {
            this.voto = voto;
        } else {
            JOptionPane.showMessageDialog(null, "Valore errato");
        }
    }

    // metodo per leggere il voto
    int leggoVoto() {
        return voto;
    }

    String comeTiChiami() {                         // dichiaro il "metodo" (comeTiChiami) di tipo String, quindi inizializzo subito una variabile di 
        String ris = "test";                         // tipo String (ris), che utilizzerò per il mio "return ris"

        // elaboro la mia variabile di ritorno (ris) con le mie proprietà più una frase di presentazione (imputata manualmente)
        ris = "ciao a tutti, mi chiamo " + nome + " " + cognome;

        // ritorno la mai elaborazione
        return ris;
    }

    boolean confronta(Esaminando avversario) {
        boolean ris = false;
        if (voto > avversario.leggoVoto()) {
            ris = true;
        }
        return ris;

    }
}
