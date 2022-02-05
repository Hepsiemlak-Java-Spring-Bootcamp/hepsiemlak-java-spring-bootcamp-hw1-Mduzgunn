package com.md;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kullanici {
    String kullaniciTipi;
    String isim;
    String email;
    String fotograf;
    String biyografi;
    String vkn;
    Set<Ilan> favoriIlanlar = new HashSet<>();
    List<Ilan> yayinladigiIlanlar = new ArrayList<>();
    List<Mesaj> mesajKutusu;
    private Role userRole;

    public Kullanici(String kullaniciTipi, String isim, String email) {
        super();
        this.kullaniciTipi = kullaniciTipi;
        this.isim = isim;
        this.email = email;
    }
    public Kullanici(String kullaniciTipi, String isim, String email,Role userRole) {
        super();
        this.kullaniciTipi = kullaniciTipi;
        this.isim = isim;
        this.email = email;
        this.userRole=userRole;
    }

    public Kullanici(String kullaniciTipi, String isim, String email, Set<Ilan> favoriIlanlar) {
        this.kullaniciTipi = kullaniciTipi;
        this.isim = isim;
        this.email = email;
        this.favoriIlanlar = favoriIlanlar;
    }

    public String getKullaniciTipi() {
        return kullaniciTipi;
    }

    public void setKullaniciTipi(String kullaniciTipi) {
        this.kullaniciTipi = kullaniciTipi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotograf() {
        return fotograf;
    }

    public void setFotograf(String fotograf) {
        this.fotograf = fotograf;
    }

    public String getBiyografi() {
        return biyografi;
    }

    public void setBiyografi(String biyografi) {
        this.biyografi = biyografi;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public Set<Ilan> getFavoriIlanlar() {
        return favoriIlanlar;
    }

    public void setFavoriIlanlar(Set<Ilan> favoriIlanlar) {
        this.favoriIlanlar = favoriIlanlar;
    }

    public List<Ilan> getYayinladigiIlanlar() {
        return yayinladigiIlanlar;
    }

    public void setYayinladigiIlanlar(List<Ilan> yayinladigiIlanlar) {
        this.yayinladigiIlanlar = yayinladigiIlanlar;
    }

    public List<Mesaj> getMesajKutusu() {
        return mesajKutusu;
    }

    public void setMesajKutusu(List<Mesaj> mesajKutusu) {
        this.mesajKutusu = mesajKutusu;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
}
