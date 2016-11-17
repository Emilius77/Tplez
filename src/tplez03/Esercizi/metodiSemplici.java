package tplez01;

/**
 *
 * @author tss
 */
public class metodiSemplici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //dichiaro variabili e assegno valori a caso mica tanto
           //meglio se so quale risultato verrebbe
        int a = 2;
        int b = 3;
        int c = 4;
        //dichiaro i risultati da far vedere
        int risprod;
        int rissomma;
        //uso metodi per calcolare risultati
        risprod = prodValori(a, b, c);
        rissomma = sommaValori(a, b, c);
        //faccio l'output dei risultati'
        System.out.println("prodotto: "+a +"X"+b +"X"+c +"=" + risprod);
        System.out.println("somma: "+a +"+"+b +"+"+c +"=" + rissomma);
        
    }
    //metodo che ritorna un int somma o prodotto dei 3 parametri
    static int prodValori(int a, int b, int c) {
        int ris = 0;
        ris = a * b * c;
        return ris;
    }

    static int sommaValori(int a, int b, int c) {
        int ris ;
        ris = a + b + c;
        return ris;
    }

}
