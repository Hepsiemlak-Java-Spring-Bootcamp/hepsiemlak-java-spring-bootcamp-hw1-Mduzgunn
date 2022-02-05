package com.md;

import java.time.LocalDate;

public class Islem {
    private int islemId;
    private LocalDate islemTarihi;
    private double islemFiyatı;
    private Kullanici kullanici;
    private Gayrimenkul gayrimenkul;

    public Islem() {
    }

    public Islem(int islemId, LocalDate islemTarihi, double islemFiyatı, Kullanici kullanici, Gayrimenkul gayrimenkul) {
        this.islemId = islemId;
        this.islemTarihi = islemTarihi;
        this.islemFiyatı = islemFiyatı;
        this.kullanici = kullanici;
        this.gayrimenkul = gayrimenkul;
    }

    public int getIslemId() {
        return islemId;
    }

    public void setIslemId(int islemId) {
        this.islemId = islemId;
    }

    public LocalDate getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(LocalDate islemTarihi) {
        this.islemTarihi = islemTarihi;
    }

    public double getIslemFiyatı() {
        return islemFiyatı;
    }

    public void setIslemFiyatı(double islemFiyatı) {
        this.islemFiyatı = islemFiyatı;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Gayrimenkul getGayrimenkul() {
        return gayrimenkul;
    }

    public void setGayrimenkul(Gayrimenkul gayrimenkul) {
        this.gayrimenkul = gayrimenkul;
    }
}
