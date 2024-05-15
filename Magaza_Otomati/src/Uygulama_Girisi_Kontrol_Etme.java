
import java.util.Scanner;

public class Uygulama_Girisi_Kontrol_Etme {

    public boolean giris(Kullanicilar kullanici) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Kullanici Adinizi Giriniz");
        String kullanici_isim = scan.nextLine();
        System.out.println("Lutfen Parolanizi Giriniz");
        String kullanici_parola = scan.nextLine();

        if (kullanici.getKullaniciAdi().equals(kullanici_isim) && kullanici.getParola().equals(kullanici_parola)) {
            return true;

        } else {

            return false;
        }

    }

    public boolean Yoneticigiris(Yönetici yonetici) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Kullanici Adinizi Giriniz");
        String yonetici_isim = scan.nextLine();
        System.out.println("Lutfen Parolanizi Giriniz");
        String yonetici_parola = scan.nextLine();

        if (yonetici.getKullaniciad().equals(yonetici_isim) && yonetici.getParola().equals(yonetici_parola)) {
            return true;
        } else {
            return false;
        }

    }

}
