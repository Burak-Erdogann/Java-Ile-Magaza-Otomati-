
public class Yönetici {

    private String isim;
    private String kullaniciad;
    private String parola;
    private int id;

    public Yönetici(String isim, String kullaniciad, String parola, int id) {
        this.isim = isim;
        this.kullaniciad = kullaniciad;
        this.parola = parola;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKullaniciad() {
        return kullaniciad;
    }

    public void setKullaniciad(String kullaniciad) {
        this.kullaniciad = kullaniciad;
    }

    public String getParola() { // set parola yoktur cünkü yöneticinin parolasi sabittir.
        return parola;
    }

}
