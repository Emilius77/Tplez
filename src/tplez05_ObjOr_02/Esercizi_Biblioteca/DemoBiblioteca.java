/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inizio a creare un oggetto "Biblioteca"
        Biblioteca bib = new Biblioteca("Biblioteca Ivrea", "Via Ottinetti, 2 - Ivrea");
        
        //inizio a creare oggetti "Dipendente"
        Dipendente d1 = new Dipendente("Rossi", "Mario", "Bibliotecario");
        Dipendente d2 = new Dipendente("Gentiloni", "Matteo", "Premier");
        
        //aggiungo i "dipendenti" creati all'interno dell'ArrayList "elencoDipendenti"
        bib.getElencoDipendenti().add(d2);
        bib.getElencoDipendenti().add(d1);
        
        //inizio a creare oggetti "Libro"
        Libro l1 = new Libro("Il Signore degli Anelli", "J. R. R. Tolkien", 1);
        Libro l2 = new Libro("Lo Hobbit", "J. R. R. Tolkien", 2);
        Libro l3 = new Libro("Vortice", "Clive Cussler", 3);
        Libro l4 = new Libro("Enigma", "Clive Cussler", 4);
        Libro l5 = new Libro("Iceberg", "Clive Cussler", 5);
        
        //aggiungo i "libri" creati all'interno dell'ArrayLIst "elencoLibri"
        bib.getElencoLibri().add(l1);
        bib.getElencoLibri().add(l2);
        bib.getElencoLibri().add(l3);
        bib.getElencoLibri().add(l4);
        bib.getElencoLibri().add(l5);
        
        //creo l'istruzione di output che richiama il metodo "getSchederio" della classe "Biblioteca"
        JOptionPane.showMessageDialog(null, bib.getSchedario());
        
    
    }
    
}
