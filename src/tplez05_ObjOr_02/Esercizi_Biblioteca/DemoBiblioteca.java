/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Biblioteca;

import java.util.Date;
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
        bib.getElencoDipendenti().add(d1);
        bib.getElencoDipendenti().add(d2);
        
        //inizio a creare oggetti "Cliente"
        Cliente c1 = new Cliente("Sir", "Marco", 1);
        Cliente c2 = new Cliente("Russo", "Davide", 2);
        
        //aggiungo i "clienti" creati all'interno dell'ArrayList "elencoClienti"
        bib.getElencoClienti().add(c1);
        bib.getElencoClienti().add(c2);
        
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
        
        //inizio a creare oggetti "Prestito"

        Prestito p1 = new Prestito(1, 1, "[0] Sir Marco - 1) Il signore degli anelli " + " - " + new Date().toString());
        Prestito p2 = new Prestito(4, 2, "[1] Russo Davide - 4) Enigma" + " - " + new Date().toString());
        
        //aggiungo i "prestiti" creati all'interno dell'ArrayLIst "elencoPrestiti"
        bib.getElencoPrestiti().add(p1);
        bib.getElencoPrestiti().add(p2);
        
        
        //creo l'istruzione di output che richiama il metodo "getSchederio" della classe "Biblioteca"
        //JOptionPane.showMessageDialog(null, bib.getSchedario());
        
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoWindowBiblioteca(bib).setVisible(true);
            }
        });
        
    }
    
}
