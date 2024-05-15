
public class MagazalarListesi {

    public Magazalar[] tüm_Magazalar = new Magazalar[5]; // toplamda 5 Magazaya sahip bir proje yaptım

    public void MagazaEkle(Magazalar magaza) { //  bu kisimda magaza listemize yeni magazalar ekledim 

        for (int i = 0; i < tüm_Magazalar.length; i++) {

            if (tüm_Magazalar[4] != null) {
                System.out.println("Tum Magaza Bolumu Dolmustur Daha Fazla Magaza Olusturamazsiniz "); // 5 ten fazla magaza olusturmayi engellediö
                break;
            }

            if (tüm_Magazalar[i] == null) {

                tüm_Magazalar[i] = magaza; // burada listeye magazayi ekledim
                break;

            }

        }

    }

    public void TumMagazalariYazdir() { // bu ise bize tum magazalari gosteren method

        System.out.println("Uygulamadaki Tum Magazalar Listeleniyor.. ");
        System.out.println("----------------------------------------");

        for (int i = 0; i < tüm_Magazalar.length; i++) {

            if (tüm_Magazalar[i] != null) { // magaza listesinde bos olmayan her kismi gondericek

                tüm_Magazalar[i].MagazaBilgileriGöster();
                System.out.println("----------------------------------------");

            }

        }

    }

    public void EnCokTakipcisiOlanMagaza() {  // bu method bize en cok takipcili magazayi gondericek

        int encoktakipci = 0;

        for (int i = 0; i < tüm_Magazalar.length; i++) {

            if (tüm_Magazalar[i] != null) {

                if (tüm_Magazalar[i].getTakipciSayisi() > encoktakipci) {
                    encoktakipci = tüm_Magazalar[i].getTakipciSayisi(); // burada tek tek takipci sayilarini kontrol edip en yuksegini bize geri dondurecek

                }

            }

        }

        for (int k = 0; k < tüm_Magazalar.length; k++) {

            if (tüm_Magazalar[k] != null) {

                if (encoktakipci == tüm_Magazalar[k].getTakipciSayisi()) { // encoktakipcili magazayi burada max ile kontrol edip bize magazanin ismini gondericek

                    System.out.println("En Cok Takipci Sayisina Sahip Olan Magaza : ");
                    tüm_Magazalar[k].MagazaBilgileriGöster();

                }

            }

        }

    }

    public void MagazalardaMaxMinBegeni() {

        int maxbegenisayisi = 0;
        int minbegenisayisi = 99999;

        for (int i = 0; i < tüm_Magazalar.length; i++) {

            if (tüm_Magazalar[i] != null) {

                if (tüm_Magazalar[i].getMagazaBegeniSayisi() > maxbegenisayisi) { //Benzer islemler yaparak begenileri kontrol ettirdim
                    maxbegenisayisi = tüm_Magazalar[i].getMagazaBegeniSayisi(); // max degeri surekli guncelleniyor tek tek
                }

            }

        }
        for (int k = 0; k < tüm_Magazalar.length; k++) {

            if (tüm_Magazalar[k] != null) {

                if (maxbegenisayisi == tüm_Magazalar[k].getMagazaBegeniSayisi()) {

                    System.out.println("En Cok Begeni Alan Magaza : ");
                    tüm_Magazalar[k].MagazaBilgileriGöster();   // en son olarak max begenili magazanin bilgilerini geri donduruyoruz

                }

            }

        }

        for (int a = 0; a < tüm_Magazalar.length; a++) {

            if (tüm_Magazalar[a] != null) {

                if (tüm_Magazalar[a].getMagazaBegeniSayisi() < minbegenisayisi) { //Benzer islemler yaparak begenileri kontrol ettirdim
                    minbegenisayisi = tüm_Magazalar[a].getMagazaBegeniSayisi(); // min degeri her turda kontrol ile son halini aliyor
                }

            }

        }

        for (int b = 0; b < tüm_Magazalar.length; b++) {

            if (tüm_Magazalar[b] != null) {

                if (minbegenisayisi == tüm_Magazalar[b].getMagazaBegeniSayisi()) {

                    System.out.println("En Az Begeni Alan Magaza : ");
                    tüm_Magazalar[b].MagazaBilgileriGöster();  //en son olarak min begenili magazanin bilgilerini geri donduruyoruz

                }

            }

        }

    }

}
