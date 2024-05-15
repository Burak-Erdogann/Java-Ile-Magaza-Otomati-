
// BURAK ERDOGAN 2121221036

import java.util.Scanner;

class UrunKontrol { // bu class i her kullanici da hangi urunu girdigini gormek icin yaptım 

    KullaniciListesi kullanicilar = new KullaniciListesi();

    public void kullanicilarToplam(int kullaniciIdd, int urunid, int adet) {
        kullanicilar.kullaniciekle(new Kullanicilar("Buse", "Ak", "21.05.2020", 116, "buse122", "fsmvü2022", 9991));
        kullanicilar.kullaniciekle(new Kullanicilar("Mehmet", "Er", "09.08.2019", 226, "mehmeterr", "fsmvü2022", 9992));
        kullanicilar.kullaniciekle(new Vip_Kullanici("Eda", "Soy", "12.02.2018", 362, "edaa123", "fsmvü2022", 3, 9993));
        kullanicilar.kullaniciekle(new Vip_Kullanici("Ayse", "Yilmaz", "17.26.2020", 149, "ayseayse11", "fsmvü2022", 3, 9994));
        // kullanicilari burada ekleyerek islemleri bu kullanicilar uzerinden degerlendiriyorum

        for (int i = 0; i < 25; i++) {

            if (kullanicilar.tümkullanicilar[i] != null) {  // kullanicilarin bos olmamasi lazim 

                if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1101) { // bu kisimda tek tek kontrol sagladim
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("1984 'George Orwell' ", 1101, "Can Yayinlari", 37, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1102) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Yabanci 'Albert Camus' ", 1102, "Altin Yayinlari", 52, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1103) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Suc Ve Ceza 'Dostoyevski' ", 1103, "Turk Is Bankasi Yayinlari", 85, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1104) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Seker Portakali 'Jose Mauro de Vasconcelos' ", 1104, "Turk Is Bankasi Yayinlari", 65, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1105) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Hayvan Ciftligi 'George Orwell' ", 1105, "Turk Is Bankasi Yayinlari", 45, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1106) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kumarbaz 'Dostoyevski' ", 1106, "Anonim Yayin Evi", 40, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1107) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kucuk Prens 'Antoine de Saint-Exupery' ", 1107, "Mavi Bulut Yayinlari", 32, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1108) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kafamda Bir Tuhaflik 'Orhan Pamuk' ", 1108, "Yapi Kredi Yayimlari", 27, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1109) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Icimizdeki Seytan 'Sabahattin Ali' ", 1109, "Yapi Kredi Yayinlari", 40, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1110) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kirmizi Pazartesi 'Gabriel Garcia Marouez' ", 1110, "Can Yayinlari", 41, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1111) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Iphone 7 ", 1111, "Apple", 4999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1112) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Iphone X ", 1112, "Apple", 8249, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1113) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Samsung A73 ", 1113, "Samsung", 5299, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1114) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Samsung S22 ", 1114, "Samsung", 16999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1115) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Iphone 11 ", 1115, "Apple", 15999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1116) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Galaxy Z Flip4 ", 1116, "Samsung", 25999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1117) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Iphone 14 Pro ", 1117, "Apple", 42990, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1118) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Redmi Note 11 Pro ", 1118, "Xiaomi ", 8999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1119) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Oppo A16 ", 1119, "Oppo", 4299, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1120) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Huawei Nova Y90 ", 1120, "Huawei", 6999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1121) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Pamuklu Gomlek ", 1121, "Avva", 229, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1122) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Slim Kot Pantolon ", 1122, "Defacto", 399, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1123) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Sweatshirt Oversize ", 1123, "AYD", 199, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1124) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kislik Kot Ceket ", 1124, "Chuba", 699, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1125) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Bogazli Kazak ", 1125, "Jack & Jones ", 499, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1126) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Takim Elbise ", 1126, "Damat", 2999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1127) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kisa Kollu Baskili Tsihrt ", 1127, "Defacto", 199, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1128) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Kaban ", 1128, "Mavi", 1599, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1129) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Cepli Yagmurluk ", 1129, "Woods Man", 299, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1130) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Sisme Mont ", 1130, "Decathlon", 799, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1131) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Televiyon 55 Inc ", 1131, "Samsung", 11999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1132) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Ps5 Oyun Konsolu ", 1132, "Sony", 18999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1133) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Xbox Series 5 Oyun Konsolu ", 1133, "Xbox", 8699, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1134) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Logitech G Pro X 7.1 Kulaklik ", 1134, "Logitech", 2299, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1135) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Acer Aspire 7 A715-43G Dizustu Bilgisayar ", 1135, "Acer", 14799, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1136) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("MSI 23.8 Pro MP241X Flat Monitor ", 1136, "Msi", 2299, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1137) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Apple Magic Mouse ", 1137, "Apple", 1860, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1138) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Samsung Galaxy Tab A7 Lite Tablet ", 1138, "Samsung", 2349, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1139) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Lenovo Ideapad 5 Pro Dizustu Bilgisayar ", 1139, "Lenovo", 15999, adet));
                } else if (kullanicilar.tümkullanicilar[i].getId() == kullaniciIdd && urunid == 1140) {
                    kullanicilar.tümkullanicilar[i].KullaniciSepetineUrunEkle(new Urun("Xiaomi Mi Watch Lite Akilli Saat ", 1140, "Xiaomi", 1599, adet));
                }
            }

        }
    }

}

public class test {

    public static void main(String[] args) {

        Magazalar[] MagazaListesi = new Magazalar[5]; // maximum 5 tane magaza olarak sinirlandirdim

        // Bu kisimda magazalari arrayimiza ekliyoruz
        MagazalarListesi magazalar = new MagazalarListesi();

        magazalar.MagazaEkle(new Magazalar("Kuzey Kitapevi ", "Bayrampasa/Istanbul", "22.03.2016", 4775, 3332, 8900, "Kitapci", 2000));
        magazalar.MagazaEkle(new Magazalar("TelefonlarKrali ", "Istanbul/Sultangazi", "09.12.2017", 1021, 1944, 3500, "Teknoloji", 2001));
        magazalar.MagazaEkle(new Magazalar("Gencler Giyim ", "Izmir/Cesme", "12.10.2019", 8760, 12000, 25000, "Giyim", 2002));
        magazalar.MagazaEkle(new Magazalar("Yenilik Magazasi ", "Istanbul/Sultangazi", "18.11.2018", 1421, 1944, 3750, "Teknoloji", 2003));

        // Magaza 1 icin stokta olan ürünler 
        MagazaListesi[1] = new Magazalar("Kuzey Kitapevi ", "Bayrampasa/Istanbul", "22.03.2016", 4775, 3332, 8900, "Kitapci", 2000);

        MagazaListesi[1].MagazayaUrunEkle(new Urun("1984 'George Orwell' ", 1101, "Can Yayinlari", 37, 60));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Yabanci 'Albert Camus' ", 1102, "Altin Yayinlari", 52, 45));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Suc Ve Ceza 'Dostoyevski' ", 1103, "Turk Is Bankasi Yayinlari", 85, 42));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Seker Portakali 'Jose Mauro de Vasconcelos' ", 1104, "Turk Is Bankasi Yayinlari", 65, 37));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Hayvan Ciftligi 'George Orwell' ", 1105, "Turk Is Bankasi Yayinlari", 45, 34));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Kumarbaz 'Dostoyevski' ", 1106, "Anonim Yayin Evi", 40, 27));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Kucuk Prens 'Antoine de Saint-Exupery' ", 1107, "Mavi Bulut Yayinlari", 32, 60));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Kafamda Bir Tuhaflik 'Orhan Pamuk' ", 1108, "Yapi Kredi Yayimlari", 27, 43));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Icimizdeki Seytan 'Sabahattin Ali' ", 1109, "Yapi Kredi Yayinlari", 40, 30));
        MagazaListesi[1].MagazayaUrunEkle(new Urun("Kirmizi Pazartesi 'Gabriel Garcia Marouez' ", 1110, "Can Yayinlari", 41, 53));

        // Magaza 2 icin stokta olan ürünler
        MagazaListesi[2] = new Magazalar("TelefonlarKrali ", "Istanbul/Sultangazi", "09.12.2017", 621, 1944, 3500, "Teknoloji", 2001);

        MagazaListesi[2].MagazayaUrunEkle(new Urun("Iphone 7 ", 1111, "Apple", 4999, 12));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Iphone X ", 1112, "Apple", 8249, 20));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Samsung A73 ", 1113, "Samsung", 5299, 17));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Samsung S22 ", 1114, "Samsung", 16999, 35));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Iphone 11 ", 1115, "Apple", 15999, 22));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Galaxy Z Flip4 ", 1116, "Samsung", 25999, 14));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Iphone 14 Pro ", 1117, "Apple", 42990, 27));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Redmi Note 11 Pro ", 1118, "Xiaomi ", 8999, 13));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Oppo A16 ", 1119, "Oppo", 4299, 22));
        MagazaListesi[2].MagazayaUrunEkle(new Urun("Huawei Nova Y90 ", 1120, "Huawei", 6999, 18));

        // Magaza 3 icin stokta olan urunler
        MagazaListesi[3] = new Magazalar("Gencler Giyim", "Izmir/Cesme", "12.10.2019", 15000, 12000, 25000, "Giyim", 2002);

        MagazaListesi[3].MagazayaUrunEkle(new Urun("Pamuklu Gomlek ", 1121, "Avva", 229, 60));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Slim Kot Pantolon ", 1122, "Defacto", 399, 84));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Sweatshirt Oversize ", 1123, "AYD", 199, 90));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Kislik Kot Ceket ", 1124, "Chuba", 699, 67));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Bogazli Kazak ", 1125, "Jack & Jones ", 499, 75));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Takim Elbise ", 1126, "Damat", 2999, 40));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Kisa Kollu Baskili Tsihrt ", 1127, "Defacto", 199, 50));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Kaban ", 1128, "Mavi", 1599, 21));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Cepli Yagmurluk ", 1129, "Woods Man", 299, 47));
        MagazaListesi[3].MagazayaUrunEkle(new Urun("Sisme Mont ", 1130, "Decathlon", 799, 39));

        // Magaza 4 icin stokta olan urunler
        MagazaListesi[4] = new Magazalar("Yenilik Magazasi ", "Istanbul/Sultangazi", "18.11.2018", 621, 1944, 3750, "Teknoloji", 2003);

        MagazaListesi[4].MagazayaUrunEkle(new Urun("Televiyon 55 Inc ", 1131, "Samsung", 11999, 20));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Ps5 Oyun Konsolu ", 1132, "Sony", 18999, 30));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Xbox Series 5 Oyun Konsolu ", 1133, "Xbox", 8699, 12));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Logitech G Pro X 7.1 Kulaklik ", 1134, "Logitech", 2299, 32));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Acer Aspire 7 A715-43G Dizustu Bilgisayar ", 1135, "Acer", 14799, 21));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("MSI 23.8 Pro MP241X Flat Monitor ", 1136, "Msi", 2299, 10));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Apple Magic Mouse ", 1137, "Apple", 1860, 47));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Samsung Galaxy Tab A7 Lite Tablet ", 1138, "Samsung", 2349, 7));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Lenovo Ideapad 5 Pro Dizustu Bilgisayar ", 1139, "Lenovo", 15999, 12));
        MagazaListesi[4].MagazayaUrunEkle(new Urun("Xiaomi Mi Watch Lite Akilli Saat ", 1140, "Xiaomi", 1599, 40));

        // Kullanicilarin Eklendigi kisim (buradaki kullanicilar alttaki kisimda hata vermemesi icin olusturuldu )
        KullaniciListesi kullanicilar = new KullaniciListesi();

        kullanicilar.kullaniciekle(new Kullanicilar("Buse", "Ak", "21.05.2020", 116, "buse122", "fsmvü2022", 9991));
        kullanicilar.kullaniciekle(new Kullanicilar("Mehmet", "Er", "09.08.2019", 226, "mehmeterr", "fsmvü2022", 9992));
        kullanicilar.kullaniciekle(new Vip_Kullanici("Eda", "Soy", "12.02.2018", 362, "edaa123", "fsmvü2022", 3, 9993));
        kullanicilar.kullaniciekle(new Vip_Kullanici("Ayse", "Yilmaz", "17.26.2020", 149, "ayseayse11", "fsmvü2022", 3, 9994));

        Yönetici yönetici = new Yönetici("Enes", "admin", "admin123", 2222);
        //yonetici magazalara urun ekleme ozelligine sahip

        Uygulama_Girisi_Kontrol_Etme giriskontrol = new Uygulama_Girisi_Kontrol_Etme(); // o class taki ozellikleri kullanmak icin cagirdim

        UrunKontrol urunozellikleri = new UrunKontrol();  // o class taki ozellikleri kullanmak icin cagirdim

        Scanner scan = new Scanner(System.in);

        int girishakki = 3; // her kullanicinin 3 giris hakkina sahip olarak tasarladim
        int girishakki2 = 3; // her kullanicinin 3 giris hakkina sahip olarak tasarladim
        int girishakki3 = 3; // her kullanicinin 3 giris hakkina sahip olarak tasarladim
        int girishakki4 = 3; // her kullanicinin 3 giris hakkina sahip olarak tasarladim
        int girishakki5 = 3; // her kullanicinin 3 giris hakkina sahip olarak tasarladim

        while (true) {

            System.out.println("--------------------------");
            System.out.println("Giris Sistemine Hosgeldiniz");
            System.out.println("Kullanici Girisi Yapmadan Uygulamadan Cikmak Isterseniz Lutfen '1' e Basiniz");
            System.out.println("Lutfen Kullanici Id nizi Giriniz");
            int kullaniciId = scan.nextInt(); // burada alinan deger hangi kullaniciya esitse o if bloguna yonlenicek

            if (kullaniciId == 9991) {

                System.out.println(" Buse Hanim Hosgeldiniz ");

                if (girishakki != 0) {
                    while (true) {

                        boolean girdiMi1 = giriskontrol.giris(kullanicilar.tümkullanicilar[0]); // Girisi kontrol eden kisim burasi
                        // Sadece true ya da false degeri gondericek ona gore islemlerimizi yapacagiz

                        if (girdiMi1 == true) { // eger kullanici dogru parola ve kullanici adini girerse bu blokta islemleri gerceklestirebilir

                            Scanner scan6 = new Scanner(System.in);
                            System.out.println("Buse Hanim Keyifli Alisverisler Dileriz ");
                            System.out.println("Bugun Ne yapmak Istersiniz ");
                            String tumislemler = "1.Kullanici Bilgilerimi Listele\n2.Sepetime Urun Ekle\n3.Sepetimden Urun Sil\n4.Sepetimi Goruntule\n5.Sepetimdeki En Pahali Ve En Ucuz Urunun Bilgilerini Goster\n"
                                    + "6.Magazalarin Bilgilerini Listele\n7.En Cok Takipciye Sahip Magazanin Bilgilerini Goruntule\n8.En Cok Alisveris Yapan Kullanicinin Bilgilerini Goruntule\n"
                                    + "9.Max ve Min Begeniye Sahip Magazalarin Bigilerini Goruntule\n Cıkis ıcin q ya basiniz";

                            urunozellikleri.kullanicilarToplam(kullaniciId, 1, 1); // sepeti basta null olarak hata vermemesi icin bos bir bolum ekledim
                            // tamamen etkisizdir sadece programin hata verilmemesi icin tasarlandi

                            while (true) {

                                System.out.println("--------------------------");
                                System.out.println(tumislemler); //tum  islemlerin gosterildigi kisim
                                System.out.println("--------------------------");
                                String secim = scan6.next();

                                if (secim.equals("1")) { // bu kisimda kullanici kendine ait bilgileri gorebilir

                                    System.out.println("--------------------------");
                                    kullanicilar.tümkullanicilar[0].bilgileriGöster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("2")) {

                                    MagazaListesi[1].MagazaUrunleriListele(); // burada tum magazalardaki tum urunler listelenicek
                                    MagazaListesi[2].MagazaUrunleriListele();
                                    MagazaListesi[3].MagazaUrunleriListele();
                                    MagazaListesi[4].MagazaUrunleriListele();
                                    System.out.println("Tum Urunlerin Id si Listelenmektedir Lutfen Almak Istediginiz Urunun Id sini Yaziniz");

                                    int urunidsi = scan6.nextInt();
                                    System.out.println("Kac Adet Almak Istersiniz");
                                    int adetsayisi = scan6.nextInt(); // adet miktari ve kullanici id ve urunid si methodumuza giderek urun sepete eklenecektir

                                    urunozellikleri.kullanicilarToplam(kullaniciId, urunidsi, adetsayisi); //urunozelliklerinden cagirma sebebim o urunlerin oradaki referanstaki sepete eklenmesi
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinize Eklenmistir ");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("3")) {

                                    System.out.println("--------------------------");
                                    System.out.println("Sepetiniz Goruntuleniyor.. "); // bu kisimda kullaniciya oncelikle sepetini gosterdim silecegi urunu gormek icin
                                    kullanicilar.tümkullanicilar[0].KullaniciSepetiGoster();
                                    System.out.println("Sepetinizden Hangi Urunu Silmek Istersiniz");
                                    System.out.println("Lutfen O Urunun Id sini Giriniz ");
                                    int silinenurun = scan6.nextInt();

                                    urunozellikleri.kullanicilar.tümkullanicilar[0].KullaniciSepetindenUrunSilme(silinenurun); // burada sepetteki urunu siliyoruz
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinizden Basariyla Silinmistir");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("4")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[0].KullaniciSepetiGoster(); // bu kisimda ise kullanici kendine ait sepeti goruyor
                                    System.out.println("--------------------------");

                                } else if (secim.equals("5")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[0].SepettekiMaxMinTutarlıUrun(); // bu method bize sepetteki en pahali ve en ucuz urunun bilgilerini gosteriyor
                                    System.out.println("--------------------------");

                                } else if (secim.equals("6")) {

                                    magazalar.TumMagazalariYazdir(); // burada tum magazalarin bilgilerini listeliyor..

                                } else if (secim.equals("7")) {

                                    System.out.println("--------------------------");
                                    magazalar.EnCokTakipcisiOlanMagaza(); // burada en cok takipcili magazanin bilgilerini listeliyoruz
                                    System.out.println("--------------------------");

                                } else if (secim.equals("8")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.EnCokAlısverisYapanKullici(); // burada en cok alisveris yapan kullanicinin bilgilerini listeliyoruz
                                    System.out.println("--------------------------");

                                } else if (secim.equals("9")) {

                                    System.out.println("--------------------------");
                                    magazalar.MagazalardaMaxMinBegeni(); // burada en cok begeniye sahip magazayi ve en az begeniye sahip magazanin bilgilerini listeliyoruz
                                    System.out.println("--------------------------");

                                } else if (secim.equals("q")) {

                                    System.out.println("Sistemden Cikis Yapiliyor Iyi Gunler Dileriz..."); // q ya basarak cikisimizi yapiyoruz
                                    break;
                                } else {
                                    System.out.println("Lutfen Gecerli Bir Islem Giriniz "); // islemler disinda deger girilirse tekrar islem isteniyor
                                }

                            }
                            break;

                        } else {
                            System.out.println("Kullanici Adiniz Veya Parolanizi Yanlis Lutfen Dogru Bir Sekilde Tekrar Giriniz");
                            girishakki--; // yanlis durumlarda giris hakkini azaltiyoruz
                            System.out.println("Kalan Toplam Giris Hakkiniz : " + girishakki);
                        }

                        if (girishakki == 0) {
                            System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz "); // eger giris hakki biterse programdan hic islem yapilmadan cikiliyor
                            break;
                        }

                    }
                } else {
                    System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz "); // eger giris hakki biterse programdan hic islem yapilmadan cikiliyor

                }

            } else if (kullaniciId == 9992) {

                System.out.println(" Mehmet Bey Hosgeldiniz ");

                if (girishakki2 != 0) {
                    while (true) {

                        boolean girdiMi2 = giriskontrol.giris(kullanicilar.tümkullanicilar[1]);

                        if (girdiMi2 == true) {

                            Scanner scan5 = new Scanner(System.in);
                            System.out.println("Eda Hanim Keyifli Alisverisler Dileriz ");
                            System.out.println("Bugun Ne yapmak Istersiniz ");
                            String tumislemler = "1.Kullanici Bilgilerimi Listele\n2.Sepetime Urun Ekle\n3.Sepetimden Urun Sil\n4.Sepetimi Goruntule\n5.Sepetimdeki En Pahali Ve En Ucuz Urunun Bilgilerini Goster\n"
                                    + "6.Magazalarin Bilgilerini Listele\n7.En Cok Takipciye Sahip Magazanin Bilgilerini Goruntule\n8.En Cok Alisveris Yapan Kullanicinin Bilgilerini Goruntule\n"
                                    + "9.Max ve Min Begeniye Sahip Magazalarin Bigilerini Goruntule\n Cıkis ıcin q ya basiniz";

                            urunozellikleri.kullanicilarToplam(kullaniciId, 1, 1); // sepeti basta null olarak hata vermemesi icin bos bir bolum ekledim
                            // tamamen etkisizdir sadece programin hata verilmemesi icin tasarlandi

                            while (true) {

                                System.out.println("--------------------------");
                                System.out.println(tumislemler);
                                System.out.println("--------------------------");
                                String secim = scan5.next();

                                if (secim.equals("1")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.tümkullanicilar[1].bilgileriGöster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("2")) {
                                    MagazaListesi[1].MagazaUrunleriListele();
                                    MagazaListesi[2].MagazaUrunleriListele();
                                    MagazaListesi[3].MagazaUrunleriListele();
                                    MagazaListesi[4].MagazaUrunleriListele();
                                    System.out.println("Tum Urunlerin Id si Listelenmektedir Lutfen Almak Istediginiz Urunun Id sini Yaziniz");

                                    int urunidsi = scan5.nextInt();
                                    System.out.println("Kac Adet Almak Istersiniz");
                                    int adetsayisi = scan5.nextInt();

                                    urunozellikleri.kullanicilarToplam(kullaniciId, urunidsi, adetsayisi);
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinize Eklenmistir ");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("3")) {
                                    System.out.println("--------------------------");
                                    System.out.println("Sepetiniz Goruntuleniyor.. ");
                                    urunozellikleri.kullanicilar.tümkullanicilar[1].KullaniciSepetiGoster();
                                    System.out.println("Sepetinizden Hangi Urunu Silmek Istersiniz");
                                    System.out.println("Lutfen O Urunun Id sini Giriniz ");
                                    int silinenurun = scan5.nextInt();

                                    urunozellikleri.kullanicilar.tümkullanicilar[1].KullaniciSepetindenUrunSilme(silinenurun);
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinizden Basariyla Silinmistir");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("4")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[1].KullaniciSepetiGoster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("5")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[1].SepettekiMaxMinTutarlıUrun();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("6")) {

                                    magazalar.TumMagazalariYazdir();

                                } else if (secim.equals("7")) {

                                    System.out.println("--------------------------");
                                    magazalar.EnCokTakipcisiOlanMagaza();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("8")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.EnCokAlısverisYapanKullici();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("9")) {

                                    System.out.println("--------------------------");
                                    magazalar.MagazalardaMaxMinBegeni();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("q")) {

                                    System.out.println("Sistemden Cikis Yapiliyor Iyi Gunler Dileriz...");
                                    break;
                                } else {
                                    System.out.println("Lutfen Gecerli Bir Islem Giriniz");
                                }

                            }
                            break;

                        } else {
                            System.out.println("Kullanici Adiniz Veya Parolanizi Yanlis Lutfen Dogru Bir Sekilde Tekrar Giriniz");
                            girishakki2--;
                            System.out.println("Kalan Toplam Giris Hakkiniz : " + girishakki2);
                        }

                        if (girishakki2 == 0) {
                            System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                            break;
                        }

                    }

                } else {
                    System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                }

            } else if (kullaniciId == 9993) {

                System.out.println(" Eda Hanim Hosgeldiniz ");

                if (girishakki3 != 0) {
                    while (true) {

                        boolean girdiMi3 = giriskontrol.giris(kullanicilar.tümkullanicilar[2]);

                        if (girdiMi3 == true) {

                            Scanner scan4 = new Scanner(System.in);
                            System.out.println("Eda Hanim Keyifli Alisverisler Dileriz ");
                            System.out.println("Bugun Ne yapmak Istersiniz ");
                            String tumislemler = "1.Kullanici Bilgilerimi Listele\n2.Sepetime Urun Ekle\n3.Sepetimden Urun Sil\n4.Sepetimi Goruntule\n5.Sepetimdeki En Pahali Ve En Ucuz Urunun Bilgilerini Goster\n"
                                    + "6.Magazalarin Bilgilerini Listele\n7.En Cok Takipciye Sahip Magazanin Bilgilerini Goruntule\n8.En Cok Alisveris Yapan Kullanicinin Bilgilerini Goruntule\n"
                                    + "9.Max ve Min Begeniye Sahip Magazalarin Bigilerini Goruntule\n Cıkis ıcin q ya basiniz";

                            urunozellikleri.kullanicilarToplam(kullaniciId, 1, 1); // sepeti basta null olarak hata vermemesi icin bos bir bolum ekledim
                            // tamamen etkisizdir sadece programin hata verilmemesi icin tasarlandi

                            while (true) {

                                System.out.println("--------------------------");
                                System.out.println(tumislemler);
                                System.out.println("--------------------------");
                                String secim = scan4.next();

                                if (secim.equals("1")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.tümkullanicilar[2].bilgileriGöster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("2")) {
                                    MagazaListesi[1].MagazaUrunleriListele();
                                    MagazaListesi[2].MagazaUrunleriListele();
                                    MagazaListesi[3].MagazaUrunleriListele();
                                    MagazaListesi[4].MagazaUrunleriListele();
                                    System.out.println("Tum Urunlerin Id si Listelenmektedir Lutfen Almak Istediginiz Urunun Id sini Yaziniz");

                                    int urunidsi = scan4.nextInt();
                                    System.out.println("Kac Adet Almak Istersiniz");
                                    int adetsayisi = scan4.nextInt();

                                    urunozellikleri.kullanicilarToplam(kullaniciId, urunidsi, adetsayisi);
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinize Eklenmistir ");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("3")) {

                                    System.out.println("--------------------------");
                                    System.out.println("Sepetiniz Goruntuleniyor.. ");
                                    urunozellikleri.kullanicilar.tümkullanicilar[2].KullaniciSepetiGoster();
                                    System.out.println("Sepetinizden Hangi Urunu Silmek Istersiniz");
                                    System.out.println("Lutfen O Urunun Id sini Giriniz ");
                                    int silinenurun = scan4.nextInt();

                                    urunozellikleri.kullanicilar.tümkullanicilar[2].KullaniciSepetindenUrunSilme(silinenurun);
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinizden Basariyla Silinmistir");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("4")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[2].KullaniciSepetiGoster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("5")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[2].SepettekiMaxMinTutarlıUrun();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("6")) {

                                    magazalar.TumMagazalariYazdir();

                                } else if (secim.equals("7")) {

                                    System.out.println("--------------------------");
                                    magazalar.EnCokTakipcisiOlanMagaza();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("8")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.EnCokAlısverisYapanKullici();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("9")) {

                                    System.out.println("--------------------------");
                                    magazalar.MagazalardaMaxMinBegeni();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("q")) {

                                    System.out.println("Sistemden Cikis Yapiliyor Iyi Gunler Dileriz...");
                                    break;
                                } else {
                                    System.out.println("Lutfen Gecerli Bir Islem Giriniz ");
                                }

                            }
                            break;

                        } else {
                            System.out.println("Kullanici Adiniz Veya Parolanizi Yanlis Lutfen Dogru Bir Sekilde Tekrar Giriniz");
                            girishakki3--;
                            System.out.println("Kalan Toplam Giris Hakkiniz : " + girishakki3);
                        }

                        if (girishakki3 == 0) {
                            System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                            break;
                        }

                    }

                } else {
                    System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                }

            } else if (kullaniciId == 9994) {

                System.out.println(" Ayse Hanim Hosgeldiniz ");

                if (girishakki4 != 0) {
                    while (true) {

                        boolean girdiMi4 = giriskontrol.giris(kullanicilar.tümkullanicilar[3]);

                        if (girdiMi4 == true) {

                            Scanner scan3 = new Scanner(System.in);

                            System.out.println("Ayse Hanim Keyifli Alisverisler Dileriz ");
                            System.out.println("Bugun Ne yapmak Istersiniz ");

                            String tumislemler = "1.Kullanici Bilgilerimi Listele\n2.Sepetime Urun Ekle\n3.Sepetimden Urun Sil\n4.Sepetimi Goruntule\n5.Sepetimdeki En Pahali Ve En Ucuz Urunun Bilgilerini Goster\n"
                                    + "6.Magazalarin Bilgilerini Listele\n7.En Cok Takipciye Sahip Magazanin Bilgilerini Goruntule\n8.En Cok Alisveris Yapan Kullanicinin Bilgilerini Goruntule\n"
                                    + "9.Max ve Min Begeniye Sahip Magazalarin Bigilerini Goruntule\n Cıkis ıcin q ya basiniz";

                            urunozellikleri.kullanicilarToplam(kullaniciId, 1, 1); // sepeti basta null olarak hata vermemesi icin bos bir bolum ekledim
                            // tamamen etkisizdir sadece programin hata verilmemesi icin tasarlandi

                            while (true) {

                                System.out.println("--------------------------");
                                System.out.println(tumislemler);
                                System.out.println("--------------------------");
                                String secim = scan3.next();

                                if (secim.equals("1")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.tümkullanicilar[3].bilgileriGöster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("2")) {

                                    MagazaListesi[1].MagazaUrunleriListele();
                                    MagazaListesi[2].MagazaUrunleriListele();
                                    MagazaListesi[3].MagazaUrunleriListele();
                                    MagazaListesi[4].MagazaUrunleriListele();
                                    System.out.println("Tum Urunlerin Id si Listelenmektedir Lutfen Almak Istediginiz Urunun Id sini Yaziniz");

                                    int urunidsi = scan3.nextInt();
                                    System.out.println("Kac Adet Almak Istersiniz");
                                    int adetsayisi = scan3.nextInt();

                                    urunozellikleri.kullanicilarToplam(kullaniciId, urunidsi, adetsayisi);
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinize Eklenmistir ");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("3")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[3].KullaniciSepetiGoster();
                                    System.out.println("Sepetinizden Hangi Urunu Silmek Istersiniz");
                                    System.out.println("Lutfen O Urunun Id sini Giriniz ");
                                    int silinenurun = scan3.nextInt();

                                    urunozellikleri.kullanicilar.tümkullanicilar[3].KullaniciSepetindenUrunSilme(silinenurun);
                                    System.out.println("Sectiginiz Urun Basariyla Sepetinizden Basariyla Silinmistir");
                                    System.out.println("--------------------------");

                                } else if (secim.equals("4")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[3].KullaniciSepetiGoster();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("5")) {

                                    System.out.println("--------------------------");
                                    urunozellikleri.kullanicilar.tümkullanicilar[3].SepettekiMaxMinTutarlıUrun();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("6")) {

                                    magazalar.TumMagazalariYazdir();

                                } else if (secim.equals("7")) {

                                    System.out.println("--------------------------");
                                    magazalar.EnCokTakipcisiOlanMagaza();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("8")) {

                                    System.out.println("--------------------------");
                                    kullanicilar.EnCokAlısverisYapanKullici();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("9")) {

                                    System.out.println("--------------------------");
                                    magazalar.MagazalardaMaxMinBegeni();
                                    System.out.println("--------------------------");

                                } else if (secim.equals("q")) {

                                    System.out.println("Sistemden Cikis Yapiliyor Iyi Gunler Dileriz...");
                                    break;
                                } else {
                                    System.out.println("Lutfen Gecerli Bir Islem Giriniz ");
                                }

                            }

                            break;

                        } else {
                            System.out.println("Kullanici Adiniz Veya Parolanizi Yanlis Lutfen Dogru Bir Sekilde Tekrar Giriniz");
                            girishakki4--;
                            System.out.println("Kalan Toplam Giris Hakkiniz : " + girishakki4);
                        }

                        if (girishakki4 == 0) {
                            System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                            break;
                        }

                    }
                } else {
                    System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                }

            } else if (kullaniciId == 2222) {

                Scanner scan2 = new Scanner(System.in);

                System.out.println("Yonetici Hosgeldiniz");

                if (girishakki5 != 0) {
                    while (true) {

                        boolean girdiMi0 = giriskontrol.Yoneticigiris(yönetici);

                        if (girdiMi0 == true) {

                            String magazalarrrr = "Magazalar : \n1.Kuzey Kitapevi\n2.TelefonlarKrali Teknoloji Magazasi\n3.\"Gencler Giyim Magazasi\n4.Yenilik Magazasi";

                            System.out.println("--------------------------");
                            System.out.println(magazalarrrr); // magazalari ekrana bastiriyoruz
                            System.out.println("--------------------------");

                            System.out.println("Yonetici Enes Bey Hosgeldiniz Bugun Hangi Magazaya Urun Eklemek Istersiniz ? ");

                            while (true) {

                                int hangiMagaza = scan.nextInt();

                                if (hangiMagaza == 1) { // kisi sectigi magazaya urun ekleme ozelligine sahip 

                                    System.out.println("Lutfen Urunun Ozelliklerini Giriniz ");
                                    System.out.println("Lutfen Urunun Ismini ve Yazarini Giriniz Giriniz ");
                                    String urunismi = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Id sini Giriniz ");
                                    int urunid = scan2.nextInt();
                                    System.out.println("Lutfen Urunun Markasini Giriniz ");
                                    String urunmarka = scan2.nextLine();
                                    String bos = scan2.nextLine(); // bosluga bastigimizda hata almamak icin
                                    System.out.println("Lutfen Urunun Fiyatini Giriniz");
                                    int fiyat = scan2.nextInt();
                                    System.out.println("Lutfen Kac Adet Gireceginizi Yaziniz ");
                                    int adet = scan2.nextInt();
                                    // Burada yoneticinin girdigi ozelliklere gore magazalara yeni urunler ekleniyor

                                    MagazaListesi[1].MagazayaUrunEkle(new Urun(urunismi, urunid, urunmarka, fiyat, adet));

                                    System.out.println("Urununuz Magaya Basariyla Eklenmistir ");
                                    System.out.println("--------------------------");
                                    //System.out.println("Lutfen Tekrardan Kullanici Id si Giriniz!!!!");

                                    break;

                                } else if (hangiMagaza == 2) {

                                    System.out.println("Lutfen Urunun Ozelliklerini Giriniz ");
                                    System.out.println("Lutfen Urunun Ismini ve Yazarini Giriniz Giriniz ");
                                    String urunismi = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Id sini Giriniz ");
                                    int urunid = scan2.nextInt();
                                    System.out.println("Lutfen Urunun Markasini Giriniz ");
                                    String urunmarka = scan2.nextLine();
                                    String bos = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Fiyatini Giriniz");
                                    int fiyat = scan2.nextInt();
                                    System.out.println("Lutfen Kac Adet Gireceginizi Yaziniz ");
                                    int adet = scan2.nextInt();

                                    MagazaListesi[2].MagazayaUrunEkle(new Urun(urunismi, urunid, urunmarka, fiyat, adet));

                                    System.out.println("Urununuz Magaya Basariyla Eklenmistir ");

                                    break;

                                } else if (hangiMagaza == 3) {

                                    System.out.println("Lutfen Urunun Ozelliklerini Giriniz ");
                                    System.out.println("Lutfen Urunun Ismini ve Yazarini Giriniz Giriniz ");
                                    String urunismi = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Id sini Giriniz ");
                                    int urunid = scan2.nextInt();
                                    System.out.println("Lutfen Urunun Markasini Giriniz ");
                                    String urunmarka = scan2.nextLine();
                                    String bos = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Fiyatini Giriniz");
                                    int fiyat = scan2.nextInt();
                                    System.out.println("Lutfen Kac Adet Gireceginizi Yaziniz ");
                                    int adet = scan2.nextInt();

                                    MagazaListesi[3].MagazayaUrunEkle(new Urun(urunismi, urunid, urunmarka, fiyat, adet));

                                    System.out.println("Urununuz Magaya Basariyla Eklenmistir ");

                                    break;

                                } else if (hangiMagaza == 4) {

                                    System.out.println("Lutfen Urunun Ozelliklerini Giriniz ");
                                    System.out.println("Lutfen Urunun Ismini ve Yazarini Giriniz Giriniz ");
                                    String urunismi = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Id sini Giriniz ");
                                    int urunid = scan2.nextInt();
                                    System.out.println("Lutfen Urunun Markasini Giriniz ");
                                    String urunmarka = scan2.nextLine();
                                    String bos = scan2.nextLine();
                                    System.out.println("Lutfen Urunun Fiyatini Giriniz");
                                    int fiyat = scan2.nextInt();
                                    System.out.println("Lutfen Kac Adet Gireceginizi Yaziniz ");
                                    int adet = scan2.nextInt();

                                    MagazaListesi[4].MagazayaUrunEkle(new Urun(urunismi, urunid, urunmarka, fiyat, adet));

                                    System.out.println("Urununuz Magaya Basariyla Eklenmistir ");

                                    break;

                                } else {
                                    System.out.println("Lutfen Sadece Gecerli Bir Magaza Giriniz ");
                                }

                            }

                            break;

                        } else {
                            System.out.println("Kullanici Adiniz Veya Parolanizi Yanlis Lutfen Dogru Bir Sekilde Tekrar Giriniz");
                            girishakki5--;
                            System.out.println("Kalan Toplam Giris Hakkiniz : " + girishakki5);
                        }

                        if (girishakki5 == 0) {
                            System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                            break;
                        }

                    }
                } else {
                    System.out.println(" Uzgunuz Tum Giris Haklarinizi Doldurdunuz ");
                }

            } else if (kullaniciId == 1) {

                System.out.println("Uygulamadan Cikis Yapiliyor Keyifli Gunler Dileriz");
                break;

            } else {
                System.out.println("Lutfen Gecerli Bir Id Giriniz!!!!");

            }

        }

    }

}
