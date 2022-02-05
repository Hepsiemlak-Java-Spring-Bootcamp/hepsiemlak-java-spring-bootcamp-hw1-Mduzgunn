package com.md;

public class Gayrimenkul {
    private String il;
    private String ilce;
    private String konutTipi;
    private String odaSayisi;
    private int alan;
    private int bulunduguKat;
    private int fiyat;

    public Gayrimenkul() {
    }

    public Gayrimenkul(String il, String ilce, String konutTipi, String odaSayisi, int alan, int bulunduguKat,int fiyat) {
        this.il = il;
        this.ilce = ilce;
        this.konutTipi = konutTipi;
        this.odaSayisi = odaSayisi;
        this.alan = alan;
        this.bulunduguKat = bulunduguKat;
        this.fiyat=fiyat;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getKonutTipi() {
        return konutTipi;
    }

    public void setKonutTipi(String konutTipi) {
        this.konutTipi = konutTipi;
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public int getBulunduguKat() {
        return bulunduguKat;
    }

    public void setBulunduguKat(int bulunduguKat) {
        this.bulunduguKat = bulunduguKat;
    }
}
