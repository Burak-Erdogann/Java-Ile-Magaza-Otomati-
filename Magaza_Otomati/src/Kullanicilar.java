
public class Kullanicilar {

    private String isim;  // Classimizin Ozellikleri
    private String soyisim;
    private String üyelikTarih;
    private int alısverisSayisi;
    private String kullaniciAdi;
    private String parola;
    private int id;

    public Urun[] Sepet = new Urun[100]; // Sepetimizi burada aciyoruz ve urun classindaki methodlari cagirabiliyoruz
    KullaniciListesi k ;
    public Kullanicilar(String isim, String soyisim, String üyelikTarih, int alısverisSayisi, String kullaniciAdi, String parola, int id) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.üyelikTarih = üyelikTarih;
        this.alısverisSayisi = alısverisSayisi;   // Burada ise Constructor'umuzu olusturuyoruz
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.id = id;
        
    }

    public void bilgileriGöster() {
        System.out.println("Kisinin Bilgileri Gosteriliyor : ");
        System.out.println("Kullanicinin Ismi : " + isim);
        System.out.println("Kullanicinin Soyismi : " + soyisim);      // Bu basit bir bilgileri goster methodudur
        System.out.println("Kullanicinin Uyelik Tarihi : " + üyelikTarih);
        System.out.println("Kullanicinin Toplam Alisveris Sayisi : " + alısverisSayisi);
        System.out.println("Kullanicinin Uygulamada Kayitli Olan Kullanici Adi : " + kullaniciAdi);

    }

    public void KullaniciSepetineUrunEkle(Urun urunler) { // Methodun icine urun objesini göndererek sepete direk urun gondermis oluyoruz

        for (int i = 0; i < Sepet.length; i++) {

            if (Sepet[i] == null) { // Eger sepetteki o kisim bossa bu kisima urunu ekleriz
                Sepet[i] = urunler;
                break; //dongu hata vermesin diye olusturuldu
            }

        }
    }

    public void KullaniciSepetindenUrunSilme(int ürünid) { // bu kisimda kullanicidan bir urun id si methodu olusturuyoruz

        for (int i = 0; i < Sepet.length; i++) {

            if (Sepet[i] != null && Sepet[i].getId() == ürünid) { // sepetteki o kisim bos olmamali ve urun id si ile girilen id birbirine esit olmalidir

                Sepet[i] = null; // bu sayede ise urunu silmeyi basariyoruz
                break;

            }

        }

    }

    public void KullaniciSepetiGoster() {

        int tutar = 0; // toplam tutari gormek icin olusturdum

        for (int i = 0; i < Sepet.length; i++) {
            if (Sepet[i] != null) {

                Sepet[i].SepettekiUrunBilgisi(); // sepette i kismi bos degilse o kisimdaki urununun bilgilerini goruyoryuz
                tutar += Sepet[i].getFiyat() * Sepet[i].getStok(); // tutar a da bu urunun fiyatini giriyoruz
            }

        }
        System.out.println("*****************");
        System.out.println("Sepetinizin Toplam Tutari = " + tutar + "TL");
        System.out.println("*****************");

    }

    public void SepettekiMaxMinTutarlıUrun() {

        int max = 0;
        int min = 10000;

        // Bu Kisim bize max tutarli urunu ve bilgilerini donduren fonksiyonlardan olusur.
        for (int i = 0; i < Sepet.length; i++) {

            if (Sepet[i] != null) {

                if (Sepet[i].getFiyat() > max) {
                    max = Sepet[i].getFiyat(); // her turda max degerini sepetteki urunun fiyati ile karsilastiriyoruz

                }

            }

        }

        for (int k = 0; k < Sepet.length; k++) {

            if (Sepet[k] != null) {

                if (Sepet[k].getFiyat() == max) { // burada son gelen max degerini hangi urunun fiyatina esit oldugunu kontrol ediyoruz.

                    System.out.println("Sepetteki Maximum Tutara Sahip Urun : ");
                    Sepet[k].SepettekiUrunBilgisi(); // O urunun bilgilerini ekrana yazdiriyoruz

                }
            }

        }
        // Bu Kisim bize min tutarli urunu ve bilgilerini donduren fonksiyonlardan olusur
        for (int z = 0; z < Sepet.length; z++) {

            if (Sepet[z] != null) {

                if (Sepet[z].getFiyat() < min) { // her turda min degerini sepetteki urunun fiyati ile karsilastiriyoruz
                    min = Sepet[z].getFiyat();

                }

            }

        }

        for (int a = 0; a < Sepet.length; a++) {

            if (Sepet[a] != null) {

                if (Sepet[a].getFiyat() == min) { // burada son gelen min degerini hangi urunun fiyatina esit oldugunu kontrol ediyoruz.

                    System.out.println("Sepetteki Minimum Tutara Sahip Urun : ");
                    Sepet[a].SepettekiUrunBilgisi(); // O urunun bilgilerini ekrana yazdiriyoruz
                }

            }

        }

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getÜyelikTarih() {
        return üyelikTarih;
    }

    public void setÜyelikTarih(String üyelikTarih) {
        this.üyelikTarih = üyelikTarih;
    }

    public int getAlısverisSayisi() {
        return alısverisSayisi;
    }

    public void setAlısverisSayisi(int alısverisSayisi) {
        this.alısverisSayisi = alısverisSayisi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
