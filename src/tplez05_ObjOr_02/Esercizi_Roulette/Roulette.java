/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Roulette;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Roulette {
    
    private int numeroRoulette;
    
    // costruttore
    public Roulette(int numero){
        numero = 36;
        numeroRoulette = numero;
    }
    
    /**
     * * ritorna un numero casuale tra 0 e 36
     * 
     * @return 
     */
    
    public int lancio(){
        Random rmd = new Random ();
        return rmd.nextInt(numeroRoulette);
    }
    
   
    
    
}
