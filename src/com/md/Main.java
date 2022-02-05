package com.md;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici("Kurumsal", "Fatma", "fatma@gmail.com");
        kullanici1.mesajKutusu = prepareMesajKutusu();
        Kullanici kullanici2 = new Kullanici("Bireysel", "Hayriye", "hayriye@gmail.com");
        kullanici2.mesajKutusu = prepareMesajKutusu();
        Kullanici kullanici3 = new Kullanici("Bireysel", "Ayse", "ayse.sari@gmail.com");
        kullanici3.mesajKutusu = prepareMesajKutusu();

        List<Ilan> ilanListesi = new ArrayList<>();
        ilanListesi.add(prepareIlan("ilan 1", kullanici1));
        ilanListesi.add(prepareIlan("ilan 2", kullanici2));
        ilanListesi.add(prepareIlan("ilan 3", kullanici3));
        ilanListesi.add(prepareIlan("ilan 4", kullanici3));

        kullanici1.favoriIlanlar.add(ilanlar().get(0));
        kullanici2.favoriIlanlar.add(ilanlar().get(0));
        kullanici3.favoriIlanlar.add(ilanlar().get(2));
        kullanici3.favoriIlanlar.add(ilanlar().get(1));

        System.out.println(" MESAJ BAŞLIK=> " + prepareMesajKutusu().get(1).baslik + " ALICI=> " +  prepareMesajKutusu().get(1).getAlici().isim + " GÖNDEREN=> " +  prepareMesajKutusu().get(1).getGonderici().isim);
        System.out.println(" MESAJ BAŞLIK=> " + prepareMesajKutusu().get(0).baslik + " ALICI=> " +  prepareMesajKutusu().get(0).getAlici().isim + " GÖNDEREN=> " +  prepareMesajKutusu().get(0).getGonderici().isim);


        System.out.println("kullanıcı1 favori ilanları=> " + kullanici1.favoriIlanlar);
        System.out.println("kullanıcı3 favori ilanları=> " + kullanici3.getFavoriIlanlar());

        for (Gayrimenkul gayrimenkul: gayrimenkuller())
            if (gayrimenkul.getFiyat()<3000&&gayrimenkul.getOdaSayisi()=="2+1"||gayrimenkul.getOdaSayisi()=="3+1"){
                System.out.println(gayrimenkul.getIl()+" "+ gayrimenkul.getIlce() +" "+gayrimenkul.getOdaSayisi() +" "+ gayrimenkul.getFiyat());
            }
    }

    private static List<Mesaj> prepareMesajKutusu() {
        List<Mesaj> mesajKutusu = new ArrayList<>();
        mesajKutusu.add(new Mesaj("baslik1", new Kullanici("gönderen", "gönderen alıcı","gönderıcı@mail"),new Kullanici("alici","alıcı kullanıcı","denme@alici")));
        mesajKutusu.add(new Mesaj("baslik 2 deneme", new Kullanici("gönderen2", "gönderen alıcı2","gönderıcı2@mail"),new Kullanici("alici2","alıcı kullanıcı 2","denme2@alici")));
        return mesajKutusu;
    }
    private static List<Ilan> ilanlar() {
        List<Ilan> ilanList = new ArrayList<>();
        ilanList.add(new Ilan("baslik1"));
        ilanList.add(new Ilan("deneme"));
        ilanList.add(new Ilan("selam"));
        return ilanList;
    }
    private static Ilan prepareIlan(String baslik, Kullanici kullanici) {
        Ilan ilan = new Ilan();
        ilan.setBaslik(baslik);
        ilan.setKullanici(kullanici);
        return ilan;
    }
    private static List<Gayrimenkul> gayrimenkuller() {
        List<Gayrimenkul> gayrimenkulList = new ArrayList<>();
        gayrimenkulList.add(new Gayrimenkul("İstanbul","Beşiktaş","Ev","3+1",125,3,2000));
        gayrimenkulList.add(new Gayrimenkul("İstanbul","Sefaköy","Villa","2+1",225,4,2500));
        gayrimenkulList.add(new Gayrimenkul("İstanbul","Merkez","Villa","4+1",225,4,2500));
        gayrimenkulList.add(new Gayrimenkul("İstanbul","Bebek","Ev","1+1",325,5,4000));
        return gayrimenkulList;
        
    }


}
