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
public class ZanimanjeRoditelja implements Serializable{
    private int zanimanjeRoditelja;
    private String naziv;

    public ZanimanjeRoditelja() {
    }

    public ZanimanjeRoditelja(int zanimanjeRoditelja, String naziv) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getZanimanjeRoditelja() {
        return zanimanjeRoditelja;
    }

    public void setZanimanjeRoditelja(int zanimanjeRoditelja) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    @Override
    public String toString() {
        return zanimanjeRoditelja+"";
    }
    
    
}
