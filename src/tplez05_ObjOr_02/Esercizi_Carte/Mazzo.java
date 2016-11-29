/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Carte;

import tplez05_ObjOr_02.Esercizi_Carte.Carta;

/**
 *
 * @author tss
 */
public class Mazzo {

    private Carta mazzo[];      //dichiariamo un array di nome "mazzo", che deve ancora essere creato, che conterrà le carte
    private int numcarte;       //identifica il numero di carte del nostro mazzo

    //costruttore del mazzo
    public Mazzo(int numcarte) {
        this.numcarte = numcarte;

        //creo e dimensiono l'array "mazzo" dichiarato in precedenza
        mazzo = new Carta[numcarte];

        //qui dovrò creare tot carte ed inserirle nel mazzo
        String semicarta[] = {"", "Picche", "Fiori", "Quadri", "Cuori"};
        int valore = 1;
        int seme = 1;

        for (int i = 1; i <= numcarte; i++) {

            String nomicarta = valore + " di " + semicarta[seme];
            Carta carta = new Carta(valore, seme, nomicarta);
            mazzo[i - 1] = carta;
            valore++;

            //valore e semi correnti
            //se l'elemento corrente (i) è sulla decina (10, 20, 30, etc) resetto i valori e cambio il seme
            //ad esempio quando sono a 10 rimetto il valore ad 1 ed aumento di 1 il seme
            if (i % (numcarte / 4) == 0) {
                seme++;
                valore = 1;
            }

        }
    }

    public Carta[] getMazzo() {
        return mazzo;
    }

    public int getNumcarte() {
        return numcarte;
    }
    
    public Carta getCartaIndex(int i) {
        Carta c = null;
        c = mazzo[i];
        return c;
    }

    public void mixMazzo() {

        //soluzioni alla computer
        //con ciclo for di 1000 giri
        for (int i = 0; i < 2000; i++) {

        
        //pesco due numeri a caso da 0 a 39 e 
        //scambio le due carte corrispondenti

        //scambio carte a caso
        //int caso1 = 22;
        //int caso2 = 34;
        int caso1 = (int) Math.floor(Math.random() * numcarte);
        int caso2 = (int) Math.floor(Math.random() * numcarte);

        //la 22 con la 34
        //prendo la 22 in mano e sposto la 34 al posto della 22
        //prendo la carta 22
        Carta cartainmano = mazzo[caso1];

        //metto la carta 34 al posto della 22
        mazzo[caso1] = mazzo[caso2];

        //metto la carta che ho in mano (22) al posto della 34
        mazzo[caso2] = cartainmano;

        //fine spostamento
    }

}
}
