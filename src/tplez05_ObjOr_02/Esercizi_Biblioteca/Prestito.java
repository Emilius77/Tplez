/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05_ObjOr_02.Esercizi_Biblioteca;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Prestito {
    
    private int codLibro;
    private int codCliente;
    private String dataInizioPrestito = new Date().toString();
    private String dataFinePrestito = "";
    private boolean reso = false;
    String note;

    public Prestito(int codLibro, int codCliente, String note) {
        this.codLibro = codLibro;
        this.codCliente = codCliente;
        this.note = note;
    }
    
    public boolean isReso() {
        return reso;
    }
    
    public int getCodLibro() {
        return codLibro;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public String getDataFinePrestito() {
        return dataFinePrestito;
    }

    public String getNote() {
        return note;
    }

    public void setDataFinePrestito(String dataFinePrestito) {
        this.dataFinePrestito = dataFinePrestito;
    }

    public void setReso(boolean reso) {
        this.reso = reso;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}