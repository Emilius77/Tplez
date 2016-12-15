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
public class Libro {
    
    private String titolo;
    private String autore;
    private int codLibro;
    //private String scaffale;
    //private int numCopie;

    public Libro(String titolo, String autore, int codice) {
        this.titolo = titolo;
        this.autore = autore;
        this.codLibro = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getCodLibro() {
        return codLibro;
    }
    
    public String getInfo () {
        String msg = "";
        
        msg = getCodLibro() + ") " + getTitolo() + " - " + getAutore();
        return msg;
    }

// Nessuno deve "settare" il codice del libro!!!   
    
//    public void setCodLibro(int codLibro) {
//        this.codLibro = codLibro;
//    }
    
}
