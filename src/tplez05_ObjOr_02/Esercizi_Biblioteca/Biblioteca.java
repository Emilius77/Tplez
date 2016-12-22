/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    private String nomeBiblioteca;
    private String indirizzo;
    private int maxLibri;
    private ArrayList<Dipendente> elencoDipendenti = new ArrayList<Dipendente>();   //creo l'arrayList "elencoDipendenti" e lo istanzio (= new ArrayList<Dipendente>())
    private ArrayList<Cliente> elencoClienti = new ArrayList<Cliente>();            //creo l'arrayList "elencoClienti" e lo istanzio (= new ArrayList<Cliente>())    
    private ArrayList<Libro> elencoLibri = new ArrayList<Libro>();                 //creo l'arrayList "elencoLibrii" e lo istanzio (= new ArrayList<Libro>())
    private ArrayList<Prestito> elencoPrestiti = new ArrayList<Prestito>();         //creo l'arrayList "elencoPrestiti" e lo istanzio (= new ArrayList<Prestito>())

    private ArrayList<Prestito> elencoResi = new ArrayList<Prestito>();         //creo l'arrayList "elencoPrestiti" e lo istanzio (= new ArrayList<Prestito>())


    public Biblioteca(String nomeBiblioteca, String indirizzo) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzo = indirizzo;
        this.maxLibri = 2;
    }

    public int getMaxLibri() {
        return maxLibri;
    }

    public void setMaxLibri(int maxLibri) {
        this.maxLibri = maxLibri;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Dipendente> getElencoDipendenti() {
        return elencoDipendenti;
    }

    public ArrayList<Cliente> getElencoClienti() {
        return elencoClienti;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }

    
    public ArrayList<Prestito> getElencoResi() {
        return elencoResi;
    }

    //creo il metodo per consultare l'elenco dei libri presenti in biblioteca
    public String getSchedario() {
        String msg = "";
        //creo un ciclo for che vada a sfogliare tutto il mio ArrayList "elencoLibri"
        for (int i = 0; i < elencoLibri.size(); i++) {

            //per comodità mi creo un "Libro l" al quale assegno la get(i) dell'arraylist elencoLibri
            Libro l = elencoLibri.get(i);

            //il mio messaggio di ritorno conterrà il codice del libro + l'autore + il titolo del libro
            msg = msg + l.getCodLibro() + " - " + l.getAutore() + " - " + l.getTitolo() + "\n";
        }

        return msg;
    }

    //metodo per controllare la disonibilità di un libro guardando all'interno dell'elenco dei prestiti
    public boolean isDisponibile(int codLibro) {
        boolean ris = true;
        for (Prestito p : elencoPrestiti) {
            if (p.getCodLibro() == codLibro && p.getDataFinePrestito().equals("")) {
                ris = false;
                break;
            }
        }
        return ris;
    }

    /**
     * metodo alternativo a quello subito sopra public boolean isDisponibile(int
     * codLibro) { boolean ris = true; for (int i= 0; i < elencoPrestiti.size();
     * i++) { if (elencoPrestiti.get(i).getCodLibro() == codLibro &&
     * elencoPrestiti.get(i).getDataFinePrestito().equals("")) { ris = false;
     * break; } } return ris;
    }
     */
    public boolean isClienteMaxLimit(int codCliente) {                //creo un metodo booleano che, dopo aver ciclato e verificato i dati all'interno di un array, mi 
        boolean ris = false;                                         //restituisca un valore "vero" o "falso"!
        int conta = 0;
        for (Prestito p : elencoPrestiti) {
            if (p.getCodCliente() == codCliente && p.getDataFinePrestito().equals("")) {
                conta++;
                if (conta >= maxLibri) {
                    ris = true;
                    break;
                }
            }
        }
        return ris;

    }
}
