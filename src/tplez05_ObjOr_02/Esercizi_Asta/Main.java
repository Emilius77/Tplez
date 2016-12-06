/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Asta;

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
        
        //creo gli oggetti da mettere all'asta
        ElencoOggettiAsta listaOgg = new ElencoOggettiAsta();
        OggettoAsta ogg1 = new OggettoAsta("Pipa Antica", 25000);
        listaOgg.addOggettoAsta(ogg1);
        ogg1 = new OggettoAsta("Pippa Middleton", 250000);
        listaOgg.addOggettoAsta(ogg1);
        ogg1 = new OggettoAsta("Raffaella Fico", 1000000);
        listaOgg.addOggettoAsta(ogg1);
       
        
        //creo le persone che partecipano all'asta
        Persona a = new Persona("Elena", 7500000);
        Persona b = new Persona("Flavio", 1500000);
        Persona c = new Persona("Lroenzo", 200000);
        
        
        

    }

}
