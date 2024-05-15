
public class Vip_Kullanici extends Kullanicilar { // kalitim yardimi ile kullanicidan ozellikleri miras aliyoruz

    private int cekilisHakki; // Her vip kullanicinin her ay 2 tane cekilise katilma hakki vardir.
     // bunlar ise ekstra ozellikleri
    private int indirimOran;

    public Vip_Kullanici(String isim, String soyisim, String üyelikTarih, int alısverisSayisi, String kullaniciAdi, String parola, int cekilisHakki, int id) {
        super(isim, soyisim, üyelikTarih, alısverisSayisi, kullaniciAdi, parola, id); // super kodu ile asil subclass imiz olan kullanicilar classindan 
        this.cekilisHakki = cekilisHakki;                                           // constructoru basit bir sekilde ekliyoruz

    }

    public void bilgileriGöster() {
        super.bilgileriGöster();  // super sayesinde subclass tan bilgilerigöster methodunu aliyoruz
        System.out.println("Bu Vip Kullanicimizin Her Ay 2 Cekilise Katilma Hakki Vardir ");
        System.out.println("Bu Vip Kullanicimizin Tum Kargolari Ucretsizdir "); //ekstra bilgilerimizi de bu sayede kullaniciya gosteriyoruz
        System.out.println("Bu Vip Kullanicimizin Tum Urunlerde %15 Indirim Hakki Vardir");
    }

    @Override
    public void KullaniciSepetiGoster() {
        int tutar = 0; // toplam tutari gormek icin olusturdum

        for (int i = 0; i < Sepet.length; i++) {
            if (Sepet[i] != null) {

                Sepet[i].SepettekiUrunBilgisi(); // sepette i kismi bos degilse o kisimdaki urununun bilgilerini goruyoryuz
                tutar += Sepet[i].getFiyat() * Sepet[i].getStok() * 0.85; // tutar a da bu urunun fiyatini giriyoruz
            }

        }
        System.out.println("*****************");
        System.out.println("Sepetinizin Toplam Tutari = " + tutar + "TL");
        System.out.println("*****************");
    }

}
