/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_GestioneWallet;

/**
 *
 * @author tss
 */
public class GestionePortafoglio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Soldi valore = new Soldi(75, "euro");

        // creo due persone        
        Persone p1 = new Persone("Emilio");
        Persone p2 = new Persone("Luca");

        // creo dei soldi e li do alle persone        
        p1.getPortafoglio().addSoldi(valore);
        valore = new Soldi(25, "euro");
        p2.getPortafoglio().addSoldi(valore);
        p2.getPortafoglio().removeSoldi(25);
        

        // esempio do 1, 2, 5, 10 e 20 a tutti e due
        // quando creo la persona, gli devo creare un wallet altrimenti non sa dove mettere i soldi che gli diamo
        // creare un metodo per far si che la persona ci sappia dire quanti soldi ha ed un metodo che alla domanda:
        System.out.println(p1.getPortafoglio().quantiSoldi());
        System.out.println(p2.getPortafoglio().quantiSoldi());

        // quanti pezzi da 5? risponda 1 (in questo esempio)
        //es p1.addSoldi(5);
        //la persona, nel wallet, avrà 0 ed in fonda una moneta da 5
        // ATTENZIONE: gli devo dare la moneta, quindi il main deve crearla e poi dargliela
    }

}
