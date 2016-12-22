/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06_ObjOr_03.Matrici;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class MatrixSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Matrix n = new Matrix(10);
        System.out.println(n.printMatrix());
//        JOptionPane.showMessageDialog(null, n.printMatrix());
        //tiro a caso tra 1 e 100 e metto il numero uscito in valori

        double numcaso = Math.random() * 10 * 10;   //cerco un numero random all'interno della nostra matrice 10*10
        numcaso = Math.round(numcaso);
        int r;
        if ((numcaso) % 10 == 0) {
            r = (int) Math.floor(numcaso / 10) - 1;
        } else {
            r = (int) Math.floor(numcaso / 10);    //eseguo il calcolo che prevede la divisione del numero casuale per il numero di righe della matrice (10), conservando
            //solo la parte intera del numero
        }
        int c;
        if ((numcaso) % 10 == 0) {
            c = 10 - 1;
        } else {

        c = (int) ((numcaso % 10) - 1);           //eseguo il calcolo che prevede la divisione del numero casuale per il numero di colonnne della matrice (10), conservando
        }                                           //solo la parte del "resto" del numero

        n.valori[r][c] = String.valueOf(numcaso);
        n.valori[r][c] = numcaso + "";

        n.printMatrix();

    }

}
