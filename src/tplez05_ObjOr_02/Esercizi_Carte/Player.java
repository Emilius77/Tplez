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
    private ArrayList<Carta> carte;     //andiamo a crearci un ArrayList che conterrà le nostre carte

    int punti = 0;

    public Player(String nome) {
        this.nome = nome;

        // carte è un arrayList vuoto di carte, da usare per aggiungere / togliere carte al player
        carte = new ArrayList<Carta>();
    }

    //metodo per aggiungere all'array list una carta che mi viene passata
    public void prendeCarta(Carta c) {
        carte.add(c);       //metodo add, aggiunge in fondo a quelle che ci sono già

    }
    
    public void seiFuori(){
        carte.clear();
    }

    public String getNome() {
        return nome;
    }
    

    //metodo per il 7 e mezzo, per avere il conto dei punti ottenuti con le carte che ho nel mio array list
    public double dammiPunteggio() {
        double ris = 0;

        //ciclo for che analizza tutti gli elementi dell'array fino alla sua grandezza (size)
        for (int i = 0; i < carte.size(); i++) {
            Carta c = carte.get(i);
            if (c.getValore() < 8) {
                ris = ris + c.getValore();
            } else {
                ris = ris + 0.5;
            }

        }

        return ris;
    }
    

}
