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
public class Stavka_Rang_Liste implements Serializable{
    
    
    private int redniBroj;
    private Kandidat kandidat;
    private double brojPoena;

    public Stavka_Rang_Liste() {
    }

    public Stavka_Rang_Liste(int redniBroj, Kandidat kandidat) {
        this.redniBroj = redniBroj;
        this.kandidat = kandidat;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    
    


    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }


    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }
    
    
    
}
