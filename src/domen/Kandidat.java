/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Kandidat implements Serializable{

    private String sifraPrijave;
    private String jmbg;
    private String ime;
    private String imeRoditelja;
    private String pol;
    private String prezime;
    private String mobilni;
    private String fiksni;
    private SrednjaSkola srednjaSkola;
    private Nacionalnost nacionalnost;
    private ZanimanjeRoditelja zanimanjeRoditelja;
    private Drzevljanstvo drzevljanstvo;
    private List<Karton> listaKartona;
    private String email;
    private double brBodovaIzSkole;
    private int smer;
    private int ukupanBrojPoena;

    public Kandidat() {
    }

    public Kandidat(String sifraPrijave, String jmbg, String ime, String imeRoditelja, String pol, String prezime, String mobilni, String fiksni, SrednjaSkola srednjaSkola, Nacionalnost nacionalnost, ZanimanjeRoditelja zanimanjeRoditelja, Drzevljanstvo drzevljanstvo, String email, double brBodovaIzSkole, int smer) {
        this.sifraPrijave = sifraPrijave;
        this.jmbg = jmbg;
        this.ime = ime;
        this.imeRoditelja = imeRoditelja;
        this.pol = pol;
        this.prezime = prezime;
        this.mobilni = mobilni;
        this.fiksni = fiksni;
        this.srednjaSkola = srednjaSkola;
        this.nacionalnost = nacionalnost;
        this.zanimanjeRoditelja = zanimanjeRoditelja;
        this.drzevljanstvo = drzevljanstvo;
        this.email = email;
        this.brBodovaIzSkole = brBodovaIzSkole;
        this.smer = smer;
     
    }

    

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getPol() {
        return pol;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Karton> getListaKartona() {
        return listaKartona;
    }

    public void setListaKartona(List<Karton> listaKartona) {
        this.listaKartona = listaKartona;
    }

    public String getSifraPrijave() {
        return sifraPrijave;
    }

    public void setSifraPrijave(String sifraPrijave) {
        this.sifraPrijave = sifraPrijave;
    }

    

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMobilni() {
        return mobilni;
    }

    public void setMobilni(String mobilni) {
        this.mobilni = mobilni;
    }

    public String getFiksni() {
        return fiksni;
    }

    public void setFiksni(String fiksni) {
        this.fiksni = fiksni;
    }

    public SrednjaSkola getSrednjaSkola() {
        return srednjaSkola;
    }

    public void setSrednjaSkola(SrednjaSkola srednjaSkola) {
        this.srednjaSkola = srednjaSkola;
    }

    public Nacionalnost getNacionalnost() {
        return nacionalnost;
    }

    public void setNacionalnost(Nacionalnost nacionalnost) {
        this.nacionalnost = nacionalnost;
    }

    public ZanimanjeRoditelja getZanimanjeRoditelja() {
        return zanimanjeRoditelja;
    }

    public void setZanimanjeRoditelja(ZanimanjeRoditelja zanimanjeRoditelja) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    public Drzevljanstvo getDrzevljanstvo() {
        return drzevljanstvo;
    }

    public void setDrzevljanstvo(Drzevljanstvo drzevljanstvo) {
        this.drzevljanstvo = drzevljanstvo;
    }

    public int getUkupanBrojPoena() {
        return ukupanBrojPoena;
    }

    public void setUkupanBrojPoena(int ukupanBrojPoena) {
        this.ukupanBrojPoena = ukupanBrojPoena;
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
        final Kandidat other = (Kandidat) obj;
        if (!Objects.equals(this.jmbg, other.jmbg)) {
            return false;
        }
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBrBodovaIzSkole() {
        return brBodovaIzSkole;
    }

    public void setBrBodovaIzSkole(double brBodovaIzSkole) {
        this.brBodovaIzSkole = brBodovaIzSkole;
    }

    public int getSmer() {
        return smer;
    }

    public void setSmer(int smer) {
        this.smer = smer;
    }
    
    
}
