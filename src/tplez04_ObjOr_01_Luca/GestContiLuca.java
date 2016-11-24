/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04_ObjOr_01_Luca;

import javax.swing.JOptionPane;

/**
 *
        CorrentistaLuca cc = new CorrentistaLuca("Luca Guerrini", 1999);
        cc.setConto(8500);
        if (cc.setConto(33300)) {
            System.out.println("tuttok");
        } else {
            System.out.println("no buonooo");
        }
        
 * @author tss
 */
public class GestContiLuca {

    static CorrentistaLuca arcc[];
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int numcc;
    numcc=Integer.parseInt(JOptionPane.showInputDialog("quanti correntisti?"));
    arcc= new CorrentistaLuca[numcc];
    //ciclo per caricare correntisti
    for(int i=0;i<arcc.length;i++){
        String nominativo=JOptionPane.showInputDialog("#" + (i+1)+ " nome?");
        int anno=Integer.parseInt(JOptionPane.showInputDialog("anno nascita?"));
        CorrentistaLuca cc= new CorrentistaLuca(nominativo, anno);
        double conto=Double.parseDouble(JOptionPane.showInputDialog("quanto versi?",0));
        cc.setConto(conto);
        arcc[i]=cc;
    } //fine caricamento
    
    presentacc();
    
        
    }
    static void presentacc(){
    
    for(int i=0;i<arcc.length;i++){
        System.out.println(arcc[i].getInfo());     
    
    } //fine caricamento
    
    
    }
}
