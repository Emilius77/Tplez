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
public class Prestito {
    
    private int codLibro;
    private int codCliente;

    public Prestito(int codLibro, int codCliente) {
        this.codLibro = codLibro;
        this.codCliente = codCliente;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public int getCodCliente() {
        return codCliente;
    }
    
    
    
    
}
