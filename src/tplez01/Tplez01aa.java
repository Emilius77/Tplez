/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tplez01aa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // dichiaro una costante
        final double PGRECO = 3.1415; //con "final" si dichiara una COSTANTE e va 
        //scritta tutta in maiuscolo 

        // dichiaro le variabili che mi servono per risolvere il problema                   
        double costo_biglietto = 0; //costo del biglietto
        double raggio = 0; //raggio del pallone
        double costo_mcubo = 0; //costo metro cubo del riscaldamento
        double area; //area dello spazio utilizzabile
        double volume; //volume da riscaldare
        double costi;
        double ricavi;
        double max_persone;
        double utili;

        // dichiaro le variabili che mi servono per l'input dell'utente
        String input_raggio;
        String input_mcubo;
        String input_biglietto;
        String report;

        // inserisco i comandi che ricghiedono l'input dell'utente
        //input_raggio = JOptionPane.showInputDialog("Di che misura vuoi il pallone?"); // chiedo all'utente di specificare la variabile raggio
        input_mcubo = JOptionPane.showInputDialog("Quanto costa il riscaldamento al metro cubo?"); // chiedo all'utente di specificare il costo al mcubo
        input_biglietto = JOptionPane.showInputDialog("Quanto vuoi far pagare il biglietto?"); // chiedo all'utente di specificare il prezzo del biglietto

        //raggio = Double.parseDouble(input_raggio);
        costo_mcubo = Double.parseDouble(input_mcubo);
        costo_biglietto = Double.parseDouble(input_biglietto);

        report = "Report finale\n";
        report = report + "Il costo del metro cubo è: " + costo_mcubo + "\n";
        report = report + "Il costo del biglietto è: " + costo_biglietto + "\n";

        // PREPARO IL CODICE IN MANIERA TALE DA FARGLI FARE I CALCOLI PASSANDOGLI OGNI VOLTA UN VALORE PREDEFINITO
        // evoluzione del progetto Tplez01a
        
        // imposto i calcoli per il raggio di valore 6
        // [inizio elaborazione] dichiaro i calcoli che devo eseguire per avere i risultati che cerco
        raggio = 6;
        area = PGRECO * (raggio * raggio); //calcolo dell'area utilizzabile
        volume = (area * raggio) * 2 / 3; //calcolo del volume di una semisfera
        // double volume=2/3*PGRECO*raggio*raggio*raggio; calcolo esteso del volume di una semisfera

        volume = Math.round(volume * 100);  // moltiplico il mio valore per 100 e poi Math.round() tronca le cifre decimali
        volume = volume / 100;   // divido il mio valore per 100 per ottenere le due cifre decimali

        max_persone = Math.floor(area); //l'operatore Math.floor() serve per arrotondare un numero decimale
        costi = volume * costo_mcubo;
        ricavi = max_persone * costo_biglietto;
        utili = ricavi - costi;

        utili = Math.round(utili * 100); // moltiplico il mio valore per 100 e poi Math.round() tronca le cifre decimali
        utili = utili / 100;  // divido il mio valore per 100 per ottenere le due cifre decimali
        // [fine elaborazione]

        // preparare un output con voci da presentare una volta sola
        report = report + "Il raggio del pallone è: " + raggio + " - ";
        report = report + "Il numero di persone è: " + max_persone + " - ";        
        report = report + "Il totale dei costi è: " + costi + " - ";
        report = report + "Il totale dei ricavi è: " + ricavi + " - ";
        report = report + "Il totale degli utili è: " + utili + "\n";

        // imposto i calcoli per il raggio di valore 8
        // [inizio elaborazione] dichiaro i calcoli che devo eseguire per avere i risultati che cerco
        raggio = 8;
        area = PGRECO * (raggio * raggio); //calcolo dell'area utilizzabile
        volume = (area * raggio) * 2 / 3; //calcolo del volume di una semisfera
        // double volume=2/3*PGRECO*raggio*raggio*raggio; calcolo esteso del volume di una semisfera

        volume = Math.round(volume * 100);  // moltiplico il mio valore per 100 e poi Math.round() tronca le cifre decimali
        volume = volume / 100;   // divido il mio valore per 100 per ottenere le due cifre decimali

        max_persone = Math.floor(area); //l'operatore Math.floor() serve per arrotondare un numero decimale
        costi = volume * costo_mcubo;
        ricavi = max_persone * costo_biglietto;
        utili = ricavi - costi;

        utili = Math.round(utili * 100); // moltiplico il mio valore per 100 e poi Math.round() tronca le cifre decimali
        utili = utili / 100;  // divido il mio valore per 100 per ottenere le due cifre decimali
        // [fine elaborazione]

        // preparare un output
        report = report + "Il raggio del pallone è: " + raggio + " - ";
        report = report + "Il numero di persone è: " + max_persone + " - ";
        report = report + "Il volume da riscaldare è: " + volume + " - ";
        report = report + "Il totale dei costi è: " + costi + " - ";
        report = report + "Il totale dei ricavi è: " + ricavi + " - ";
        report = report + "Il totale degli utili è: " + utili + "\n";

        // imposto i calcoli per il raggio di valore 10
        // [inizio elaborazione] dichiaro i calcoli che devo eseguire per avere i risultati che cerco
        raggio = 10;
        area = PGRECO * (raggio * raggio); //calcolo dell'area utilizzabile
        volume = (area * raggio) * 2 / 3; //calcolo del volume di una semisfera
        // double volume=2/3*PGRECO*raggio*raggio*raggio; calcolo esteso del volume di una semisfera

        volume = Math.round(volume * 100);  // moltiplico il mio valore per 100 e poi Math.round() tronca le cifre decimali
        volume = volume / 100;   // divido il mio valore per 100 per ottenere le due cifre decimali

        max_persone = Math.floor(area); //l'operatore Math.floor() serve per arrotondare un numero decimale
        costi = volume * costo_mcubo;
        ricavi = max_persone * costo_biglietto;
        utili = ricavi - costi;

        utili = Math.round(utili * 100); // moltiplico il mio valore per 100 e poi Math.round() tronca le cifre decimali
        utili = utili / 100;  // divido il mio valore per 100 per ottenere le due cifre decimali
        // [fine elaborazione]

        // preparare un output
        report = report + "Il raggio del pallone è: " + raggio + " - ";
        report = report + "Il numero di persone è: " + max_persone + " - ";
        report = report + "Il volume da riscaldare è: " + volume + " - ";
        report = report + "Il totale dei costi è: " + costi + " - ";
        report = report + "Il totale dei ricavi è: " + ricavi + " - ";
        report = report + "Il totale degli utili è: " + utili + "\n";

        JOptionPane.showMessageDialog(null, report);
    }

}
