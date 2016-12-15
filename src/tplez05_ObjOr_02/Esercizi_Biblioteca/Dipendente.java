/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Biblioteca;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Dipendente extends Persona {

    private String ruolo;

    public Dipendente(String cognome, String nome, String ruolo) {
        super(cognome, nome);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    //creo un metodo che mi permetta di "aggiungere / creare" un nuovo libro, dopo aver controllato quale è stato l'ultimo inserito!
    //per accedere alla funzione "getCodLibro" è necessario inserire nel costruttore la classe "Biblioteca" e l'oggetto biblioteca a cui 
    //vogliamo riferirci (bib) in caso ce ne fossero più di uno.
    public String addNewLibro(String titolo, String autore, Biblioteca bib) {
        String msg = "Impossibile aggiungere il libro";
        
        if(titolo.equals("") || autore.equals("")) return msg;  //abbiamo inserito un controllo che serve a prevenire che si lascino i campi vuoti

        int code = 1;
        if (bib.getElencoLibri().size() > 0) {
            code = bib.getElencoLibri().get(bib.getElencoLibri().size() - 1).getCodLibro() + 1;
        }

        Libro l = new Libro(titolo, autore, code);
        bib.getElencoLibri().add(l);

        msg = "Aggiungo Libro " + code + ") " + titolo + " - " + autore;
        return msg;
    }
    
    //creo un metodo che mi permetta di "aggiungere / creare" un nuovo prestito
    public String addNewPrestito(int codLibro, int codCliente, Biblioteca bib) {
        String msg = "Impossibile aggiungere il prestito";
        
        if(codCliente < 0 || codLibro < 0) return msg;  //abbiamo inserito un controllo che serve a prevenire che si lascino i campi vuoti
        
        //creo un nuovo oggetto prestito
        Prestito p = new Prestito(codLibro, codCliente, "prestito del " + new Date().toString());
        bib.getElencoPrestiti().add(p);

        msg = "Aggiungo prestito " + codCliente + codLibro;
        return msg;
    }
    
     //creo un metodo che mi permetta di "aggiungere / creare" un nuovo prestito
    public String addNewPrestito(int codLibro, int codCliente, String note, Biblioteca bib) {
        String msg = "Impossibile aggiungere il prestito";
        
        if(codCliente < 0 || codLibro < 0) return msg;  //abbiamo inserito un controllo che serve a prevenire che si lascino i campi vuoti
        
        //creo un nuovo oggetto prestito
        Prestito p = new Prestito(codLibro, codCliente, note + " - " + new Date().toString());
        bib.getElencoPrestiti().add(p);

        msg = "Aggiungo prestito " + codCliente + codLibro;
        return msg;
    }

    //creo un metodo che mi permetta di "rimuovere" un nuovo libro
    public String removeLibroByIndex(int index, Biblioteca bib) {
        String msg = "Non hai selezionato nulla";
        if (index < bib.getElencoLibri().size() && index >= 0) {

            bib.getElencoLibri().remove(index);
            msg = "Libro Eliminato";
        } 
           
        return msg;
    }
}



