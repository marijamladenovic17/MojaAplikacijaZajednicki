/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Rang_Lista implements Serializable{
    
    ArrayList<Stavka_Rang_Liste> stavke;
    
    private String smer;
    private int godina;

    public Rang_Lista() {
        stavke = new ArrayList<>();
    }

    public Rang_Lista(String smer, int godina) {
        this.smer = smer;
        this.godina = godina;
    }
    
    


    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public ArrayList<Stavka_Rang_Liste> getStavke() {
        return stavke;
    }

    public void setStavke(ArrayList<Stavka_Rang_Liste> stavke) {
        this.stavke = stavke;
    }

    
    
    
    
    
    
    
}
