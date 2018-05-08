/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author student
 */
public class Samochody {
    private String marka;
    private String nazwa_samochodu;
    private int m_predkosc;
    private double cena;

    public Samochody(String marka, String nazwa_samochodu, int m_predkosc, double cena) {
        this.marka = marka;
        this.nazwa_samochodu = nazwa_samochodu;
        this.m_predkosc = m_predkosc;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa_samochodu() {
        return nazwa_samochodu;
    }

    public void setNazwa_samochodu(String nazwa_samochodu) {
        this.nazwa_samochodu = nazwa_samochodu;
    }

    public int getM_predkosc() {
        return m_predkosc;
    }

    public void setM_predkosc(int m_predkosc) {
        this.m_predkosc = m_predkosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    @Override
    public String toString()
    {
        return "Marka samochodu to"+marka+"Nazwa samochodu to"+nazwa_samochodu+"max predkosc samochodu to"+m_predkosc+"cena samochodu to"+cena;
    }
}
