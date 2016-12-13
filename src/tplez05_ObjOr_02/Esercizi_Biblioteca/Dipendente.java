/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Biblioteca;

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
    public void addNewLibro (String titolo, String autore, Biblioteca bib) {
        
        int code = bib.getElencoLibri().get(bib.getElencoLibri().size()-1).getCodLibro()+1;
        Libro l = new Libro(titolo, autore, code);
        bib.getElencoLibri().add(l);
        
    }
    
    
}
