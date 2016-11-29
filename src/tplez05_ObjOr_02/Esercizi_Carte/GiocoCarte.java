/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Carte;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GiocoCarte {

    /**
     * @param args the command line arguments
     */
    static Mazzo miomazzo;          //questo è un metodo generale che possiamo utilizzabile all'interno di tutto il nostro progetto
    static int poscarta = 0;
    static Carta cartacorrente;
    static double punteggiocorrente;

    public static void main(String[] args) {
        // TODO code application logic here

        miomazzo = new Mazzo(40);       //questa è una istanza di un oggetto "Mazzo"

        miomazzo.mixMazzo();        //richiamo il metodo per mischiare il mazzo

        String nomecarta = "elenco carte mazzo \n";
        for (int i = 0; i < 40; i++) {
            nomecarta += miomazzo.getCartaIndex(i).getNome() + "\n";
        } //mazzo pronto

        Player p1 = new Player("Emilio");                  //creo il mio giocatore p1
        Player p2 = new Player("Marco");                   //creo il mio giocatore p2

        giocata(p1);
        giocata(p2);

        double r1, r2;
        r1 = p1.dammiPunteggio();
        r2 = p2.dammiPunteggio();
        String msg = "";

        if (r1 < r2) {
            msg = "vince " + p2.getNome();
        }
        if (r1 > r2) {
            msg = "vince " + p1.getNome();
        }
        if (r1 == r2) {
            msg = "pareggio";
        }

        System.out.println(msg);

    }

    static public void giocata(Player p1) {
        boolean avanti = true;

        while (avanti == true) {

            cartacorrente = miomazzo.getCartaIndex(poscarta++);          //prendo la prima carta ed inizio

            p1.prendeCarta(cartacorrente);                      //passo la carta al mio giocatore p1

            punteggiocorrente = p1.dammiPunteggio();            //chiedo a p1 quanti punti ha

            System.out.println(punteggiocorrente + " + " + cartacorrente.getNome());

            if (punteggiocorrente >= 8) {
                avanti = false;
                p1.seiFuori();
            } else {
                //chiedo al giocatore se vuole continuare
                String input = JOptionPane.showInputDialog("Vuoi continuare? \n invio per continuare \n qualsiasi carattere per uscire");

                if (input.equals("") == false) {
                    avanti = false;
                }

            }

        } //fine gioco p1
    }

}
