/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Carte;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Player {

    private String nome = "Erik";
    private ArrayList<Carta> carteInMano;     //andiamo a crearci un ArrayList che conterrà le nostre carteInMano

    int punti = 0;

    public Player(String nome) {
        this.nome = nome;

        // carteInMano è un arrayList vuoto di carteInMano, da usare per aggiungere / togliere carteInMano al player
        carteInMano = new ArrayList<Carta>();
    }

    //metodo per aggiungere all'array list una carta che mi viene passata
    public void prendeCarta(Carta c) {
        carteInMano.add(c);       //metodo add, aggiunge in fondo a quelle che ci sono già

    }
    
    public void seiFuori(){
        carteInMano.clear();
    }

    public String getNome() {
        return nome;
    }
    
    //metodo per visualizzare le carteInMano della mia mano (pescate)
    public String showCarte(){
        String msg = "Non ho carte in mano";
        String mano = "";             //questa è la "Stringa" che voglio come ritorno
        for (int i=0; i< carteInMano.size(); i++) {       //dico al mio metodo di andare a controllare dentro l'array list "carteInMano"
            Carta c = carteInMano.get(i);                 //di prendere tutte le carteInMano che ho pescato e di
            mano += c.getNome() + "\n";             //restituirmi il valore di "tutte" (+=) le carteInMano pescate
    }
        //adesso mi ritrovo con "mano" che può essere vuoto o può avere le carte
        //se "mano" è ancora vuoto ritorno il "msg" così come l'ho dichiarato
        //altrimenti ritorno la "mano"
        
        if (mano.equals("") == true) {
            return msg;
        } else {
            return mano;
        }
    } 
   
    
    
   
    //metodo per il 7 e mezzo, per avere il conto dei punti ottenuti con le carteInMano che ho nel mio array list
    public double dammiPunteggio() {
        double ris = 0;

        //ciclo for che analizza tutti gli elementi dell'array fino alla sua grandezza (size)
        for (int i = 0; i < carteInMano.size(); i++) {
            Carta c = carteInMano.get(i);
            if (c.getValore() < 8) {
                ris = ris + c.getValore();
            } else {
                ris = ris + 0.5;
            }

        }

        return ris;
    }
    

}
