/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Clan implements Serializable{
    private int clanID;
    private String ime;
    private String prezime;
    private int komisijaID;

    public Clan() {
    }

    public Clan(int clanID, String ime, String prezime, int komisijaID) {
        this.clanID = clanID;
        this.ime = ime;
        this.prezime = prezime;
        this.komisijaID = komisijaID;
    }

    

    public int getKomisijaID() {
        return komisijaID;
    }

    public void setKomisijaID(int komisijaID) {
        this.komisijaID = komisijaID;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getClanID() {
        return clanID;
    }

    public void setClanID(int clanID) {
        this.clanID = clanID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clan other = (Clan) obj;
        if (this.clanID != other.clanID) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        return true;
    }
        
}
