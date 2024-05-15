
public class Urun {

    private String isim;
    private int id;
    private String marka;  // classimizin tek tek ozellikleri
    private int fiyat;
    private int adet;

    public Urun(String isim, int id, String marka, int fiyat, int adet) {
        this.isim = isim;
        this.id = id;
        this.marka = marka;  // Burada ise Constructor'umuzu olusturuyoruz
        this.fiyat = fiyat;
        this.adet = adet;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


    public int getStok() {
        return adet;
    }

    public void setStok(int adet) {
        this.adet = adet;
    }

    public void bilgileriGöster() {

        System.out.println("Urunun Ismi : " + isim);
        System.out.println("Urunun Id si : " + id);
        System.out.println("Urunun Markasi : " + marka);  // Bu kisimda urunumuzun bilgilerini aliyoruz.
        System.out.println("Urunun Fiyati : " + fiyat);
        System.out.println("Urunun Stok Sayisi : " + adet);

    }

    public void SepettekiUrunBilgisi() {
        System.out.println("------------------------------");
        System.out.println("Satin Alinan Urunun Bilgileri : ");
        System.out.println("Urunun Ismi : " + isim);
        System.out.println("Urunun Fiyati : " + fiyat);     // bu kisimda ise sepetteki urunlerin urunlerin bilgilerini aliyoruz
        System.out.println("Urunun Markasi : " + marka);
        System.out.println("Sepete Eklenene Urun Adeti : " + adet);
        System.out.println("Urun id si : " + id);
        

    }

}
