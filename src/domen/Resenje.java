/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Resenje implements Serializable{
    
    private int rbZadatka;
    private char odgovor;

    public Resenje() {
    }

    public Resenje(int rbZadatka, char odgovor) {
        this.rbZadatka = rbZadatka;
        this.odgovor = odgovor;
    }
    public Resenje(int rbZadatka) {
        this.rbZadatka = rbZadatka;
        
    }
    public char getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(char odgovor) {
        this.odgovor = odgovor;
    }

    public int getRbZadatka() {
        return rbZadatka;
    }

    public void setRbZadatka(int rbZadatka) {
        this.rbZadatka = rbZadatka;
    }

    @Override
    public String toString() {
        return rbZadatka+ " "+ odgovor+"\n";
    }

   

   
    
    
}
