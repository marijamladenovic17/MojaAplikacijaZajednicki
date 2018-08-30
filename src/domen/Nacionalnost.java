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
public class Nacionalnost implements Serializable{
    private int nacionalnostID;
    private String naziv;

    public Nacionalnost() {
    }

    public Nacionalnost(int nacionalnostID, String naziv) {
        this.nacionalnostID = nacionalnostID;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getNacionalnostID() {
        return nacionalnostID;
    }

    public void setNacionalnostID(int nacionalnostID) {
        this.nacionalnostID = nacionalnostID;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
