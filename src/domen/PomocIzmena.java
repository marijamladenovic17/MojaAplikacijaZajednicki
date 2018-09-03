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
public class PomocIzmena implements Serializable{
    
    int kratonId;
    ArrayList<Zadatak> zadaciZaIzmenu;

    public PomocIzmena() {
    }

    public int getKratonId() {
        return kratonId;
    }

    public void setKratonId(int kratonId) {
        this.kratonId = kratonId;
    }

    public ArrayList<Zadatak> getZadaciZaIzmenu() {
        return zadaciZaIzmenu;
    }

    public void setZadaciZaIzmenu(ArrayList<Zadatak> zadaciZaIzmenu) {
        this.zadaciZaIzmenu = zadaciZaIzmenu;
    }
}
