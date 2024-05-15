
public class Magazalar {

    private String magazaIsim;
    private String magazaAdres;
    private String acilisTarih; // Bu Classimizin Ozellikleri
    private int takipciSayisi;
    private int toplamSatis;
    private int magazaBegeniSayisi;
    private String magazaTipi;
    private int MagazaId;
    private Urun[] ürünler = new Urun[1500]; // Her Magazanin toplam 500 tane ürünü olabilir..

    public Magazalar(String magazaIsim, String magazaAdres, String acilisTarih, int takipciSayisi, int toplamSatis, int magazaBegeniSayisi, String magazaTipi, int MagazaId) {
        this.magazaIsim = magazaIsim;
        this.magazaAdres = magazaAdres;
        this.acilisTarih = acilisTarih;
        this.takipciSayisi = takipciSayisi; // Burada ise Constructor'umuzu olusturuyoruz
        this.toplamSatis = toplamSatis;
        this.magazaBegeniSayisi = magazaBegeniSayisi;
        this.magazaTipi = magazaTipi;
        this.MagazaId = MagazaId;

    }

    public int getMagazaId() {
        return MagazaId;
    }

    public void setMagazaId(int MagazaId) {
        this.MagazaId = MagazaId;
    }

    public String getMagazaIsim() {
        return magazaIsim;
    }

    public void setMagazaIsim(String magazaIsim) {
        this.magazaIsim = magazaIsim;
    }

    public String getMagazaAdres() {
        return magazaAdres;
    }

    public void setMagazaAdres(String magazaAdres) {
        this.magazaAdres = magazaAdres;
    }

    public String getAcilisTarih() {
        return acilisTarih;
    }

    public void setAcilisTarih(String acilisTarih) {
        this.acilisTarih = acilisTarih;
    }

    public int getTakipciSayisi() {
        return takipciSayisi;
    }

    public void setTakipciSayisi(int takipciSayisi) {
        this.takipciSayisi = takipciSayisi;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setToplamSatis(int toplamSatis) {
        this.toplamSatis = toplamSatis;
    }

    public int getMagazaBegeniSayisi() {
        return magazaBegeniSayisi;
    }

    public void setMagazaBegeniSayisi(int magazaBegeniSayisi) {
        this.magazaBegeniSayisi = magazaBegeniSayisi;
    }

    public void MagazaBilgileriGöster() {

        System.out.println("Magazanin Bilgileri Gosteriliyor.. ");
        System.out.println("----------------------------------------");
        System.out.println("Magazanin Ismi : " + magazaIsim);
        System.out.println("Magazanin Adresi : " + magazaAdres);        //Bu kisimda Magazamizin Bilgilerini kullaniciya gosteririz
        System.out.println("Magazanin Acilis Tarihi : " + acilisTarih);
        System.out.println("Magazanin Toplam Takipci Sayisi : " + takipciSayisi);
        System.out.println("Magazanin Bugune Kadar Yaptigi Toplam Satis : " + toplamSatis);
        System.out.println("Magazanin Toplam Begeni Sayisi : " + magazaBegeniSayisi);
        System.out.println("Magazanin Tipi : " + magazaTipi);
        System.out.println("----------------------------------------");

    }

    public void MagazayaUrunEkle(Urun urun) { // Magazamiza Yeni Urunleri Buradan Ekliyoruz 
        // Icine ise Urun objesi gonderiyoruz

        for (int i = 0; i < ürünler.length; i++) {

            if (this.ürünler[1499] != null) {
                System.out.println("Stok Dolmustur Daha Fazla Urun Ekleyemezsiniz "); // bu kisimda 1500 den fazla urun eklenirse bize bu kismi göndericektir
                break;

            }

            if (this.ürünler[i] == null) { // eger o kisimdaki urun listemizde bosluk varsa o kisima ekler

                this.ürünler[i] = urun; // burada gonderilen degeri arrayimize ekleriz
                break;

            }

        }

    }

    public void MagazaUrunleriListele() {

        System.out.println("Magazanin Urunleri Listeleniyorr..");
        System.out.println("-------------------------"); //burada her magazanin kendi urunlerini listeleyen bir method yaptim

        for (int i = 0; i < ürünler.length; i++) {

            if (ürünler[i] != null && ürünler[i].getId() > 0) { // Listede o kisimin bos olmasina ve ekstra dan id sini kontrol ettim

                System.out.println(ürünler[i].getIsim() + "Fiyati : " + ürünler[i].getFiyat() + " Urun Id si : " + ürünler[i].getId());
                System.out.println("-------------------------"); // burada ise ekrana yazdiriyoruz
            }

        }

    }

}
