package com.md;

import java.math.BigDecimal;
import java.util.Date;

public class Ilan {
    private Gayrimenkul gayrimenkul;
    private String baslik;
    private Kullanici kullanici;
    private String[] resimList = new String[5];
    private BigDecimal fiyat;
    private int suresi;
    private Date olusturulmaTarihi;

    public Ilan() {
    }
    public Ilan(String baslik) {
        this.baslik = baslik;
    }

    public Ilan(Gayrimenkul gayrimenkul, Kullanici kullanici, String[] resimList) {
        this.gayrimenkul = gayrimenkul;
        this.kullanici = kullanici;
        this.resimList = resimList;
    }

    public Ilan(Gayrimenkul gayrimenkul, String baslik, Kullanici kullanici, String[] resimList, BigDecimal fiyat,
                int suresi, Date olusturulmaTarihi) {
        super();
        this.gayrimenkul = gayrimenkul;
        this.baslik = baslik;
        this.kullanici = kullanici;
        this.resimList = resimList;
        this.fiyat = fiyat;
        this.suresi = suresi;
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Gayrimenkul getGayrimenkul() {
        return gayrimenkul;
    }

    public void setGayrimenkul(Gayrimenkul gayrimenkul) {
        this.gayrimenkul = gayrimenkul;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String[] getResimList() {
        return resimList;
    }

    public void setResimList(String[] resimList) {
        this.resimList = resimList;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public int getSuresi() {
        return suresi;
    }

    public void setSuresi(int suresi) {
        this.suresi = suresi;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }
}
