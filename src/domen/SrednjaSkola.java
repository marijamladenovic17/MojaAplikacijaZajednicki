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
public class SrednjaSkola implements Serializable{
    private int sifraSrednjeSkole;
    private String naziv;

    public SrednjaSkola() {
    }

    public SrednjaSkola(int sifraSrednjeSkole, String naziv) {
        this.sifraSrednjeSkole = sifraSrednjeSkole;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSifraSrednjeSkole() {
        return sifraSrednjeSkole;
    }

    public void setSifraSrednjeSkole(int sifraSrednjeSkole) {
        this.sifraSrednjeSkole = sifraSrednjeSkole;
    }

    @Override
    public String toString() {
        return sifraSrednjeSkole+"";
    }
    
    
}
