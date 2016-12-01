/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_GestioneWallet;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Wallet {
    
    private ArrayList<Soldi> soldi = new ArrayList<Soldi>();     //andiamo a crearci un ArrayList che conterrà i soldi della nostra persona "portafoglio"

    
    public void addSoldi(Soldi valore) {
        soldi.add(valore);
    }
    
    public void removeSoldi(double valore) {
        //se ho una moneta del valore corretto la rimuovo dall'array list
        //magari dimmi se hai fatto questa operazione oppure no
        
        for (int i=0; i<soldi.size(); i++) {
            //se la moneta che vuoi rimuovere è uguale a quella che c'è nell'array list, la rimuovo e dico "ok, l'ho rimossa"
            if (soldi.get(i).getValore() == valore) {
                soldi.remove(i);
                break;
            }
        }
    }
    
    public int quantiPezzi(double valore){
        
        return 0;
    }

    public ArrayList<Soldi> getSoldi() {
        return soldi;
    }
    
    public double quantiSoldi(){
        double ris = 0;
        for (int i=0; i<soldi.size(); i++) {
            ris += soldi.get(i).getValore();
        }
        return ris;
    }

}
