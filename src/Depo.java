public class Depo {

    //Kitapla ilgili bilgiler
    int kitapNo;
    String kitapAdi;
    String yazarAdi;
    int kitapFiyat;

    public Depo() {
    }

    public Depo(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(int kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    @Override
    public String toString() {
        return "Depo{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                '}';
    }
}
