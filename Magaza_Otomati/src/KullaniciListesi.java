
public class KullaniciListesi {

    public static Kullanicilar[] tümkullanicilar = new Kullanicilar[25];
    // 25 Kisinin Oldugu Bir Liste Acarak Kullanicilari Tek tek Burada Topladim

    public void kullaniciekle(Kullanicilar kullanici) { // Bu method kullanicilari tek tek ustte belirtilen array a ekler

        for (int i = 0; i < tümkullanicilar.length; i++) {

            if (tümkullanicilar[i] == null) { // bos olmasi önemlidir aksi takdirde dolu olan bir yere yeni kullanici eklemeye calisir java

                tümkullanicilar[i] = kullanici; // burada arrayimize ekliyoruz
                break; // break demezsek dongu devam eder kodda hata aliriz

            }

        }

        if (tümkullanicilar[24] != null) { // bu kisimda kisinin 10 dan fazla kullanicinin girmesi dahilde bize bir uyari verir
            System.out.println(" Tum Kullanici Listesi Dolmustur.. ");

        }

    }

    public void kullanicilariYazdir() {

        System.out.println("Uygulamaya Kayitli Tum Kullanicilar Listeleniyorr.."); // Buradaki methodda listemizdeki tum kullanicilari yazdiririz 
        System.out.println("-------------------------");

        for (int i = 0; i < tümkullanicilar.length; i++) {

            if (tümkullanicilar[i] != null) { // null olan kisimlari programin bize göstermemesi icin if kosulunu kullandik

                tümkullanicilar[i].bilgileriGöster(); // bu kisimda da kisilerin bilgilerini görürüz
                System.out.println("-------------------------");
            }

        }

    }

    public void EnCokAlısverisYapanKullici() {

        String enCokYapanKisi = ""; // bu kisim bize en son bir kisi döndürecek
        int encok = 0; // sayilari denetlemek icin olusturuldu 0 dan baslattim

        for (int i = 0; i < tümkullanicilar.length; i++) {

            if (tümkullanicilar[i] != null) { // null olan kisimlari denetlememek icin (hata almamak) olusturdum 

                if (tümkullanicilar[i].getAlısverisSayisi() > encok) { // tek tek tum kullanicilarin alisveris sayisini denetler

                    encok = tümkullanicilar[i].getAlısverisSayisi(); // encok degerini guncelleyerek en son degeri aliriz

                }

            }

        }

        for (int k = 1; k < tümkullanicilar.length; k++) {
            if (tümkullanicilar[k] != null) {

                if (encok == tümkullanicilar[k].getAlısverisSayisi()) { // bu kisimda ise en son encok degerini hangi magazayla eslestigini kontrol ediyoruz 

                    System.out.println("En Cok Alisveris Yapan Kullanicinin Bilgileri : ");
                    tümkullanicilar[k].bilgileriGöster(); // son olarak o kisinin adi ve soyadini yaziyoruz
                }

            }
        }

    }

}
