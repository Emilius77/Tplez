/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04_ObjOr_01;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dichiaro le variabili
        String output;

        // per prima cosa elenca le proprietà del metodo
        Esaminando alunno1 = new Esaminando("Valenti", "Ciccio");   // ho creato l'oggetto "alunno1" di "tipo Esaminando" con le caratteristiche dichiarate nel file .java corrispondente
        //alunno1.cognome = "Valenti";            // tutte le variabili "alunno. " fanno riferimento al tipo creato in altro luogo! (Esaminando)
        //alunno1.nome = "Ciccio";             // e può utlilizzare SOLO le variabili che abbiamo dichiarato nella classe specifica (Esaminando)
        alunno1.impostaVoto(86);                 // le variabili della classe "Esaminando" diventano "PROPRIETA'" dell'oggetto "alunno1"
        
        output = alunno1.comeTiChiami() + " voto:" + alunno1.leggoVoto();
        System.out.println(output);
        
        Esaminando alunno2 = new Esaminando("Reni", "Guido");   // ho creato l'oggetto "alunno1" di "tipo Esaminando" con le caratteristiche dichiarate nel file .java corrispondente
        //alunno2.cognome = "Reni";            // tutte le variabili "alunno. " fanno riferimento al tipo creato in altro luogo! (Esaminando)
        //alunno2.nome = "Guido";             // e può utlilizzare SOLO le variabili che abbiamo dichiarato nella classe specifica (Esaminando)
        alunno2.impostaVoto(80);                 // le variabili della classe "Esaminando" diventano "PROPRIETA'" dell'oggetto "alunno1"
        
        output = alunno2.comeTiChiami() + " voto:" + alunno2.leggoVoto();
        System.out.println(output);
        
        if (alunno1.confronta(alunno2)) {
            output = "bravo " + alunno1.cognome;
        } else {
            output = "bravo " + alunno2.cognome;
        }
        System.out.println(output);
    }
   
}
