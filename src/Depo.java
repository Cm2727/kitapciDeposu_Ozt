public class Depo {

    //Kitapla ilgili bilgiler
    int kitapNo;
    String yazarAdi;
    String kitapAdi;
    int kitapFiyat;

    public Depo() {
    }

    public Depo(int kitapNo, String yazarAdi, String kitapAdi, int kitapFiyat) {
        this.kitapNo = kitapNo;
        this.yazarAdi = yazarAdi;
        this.kitapAdi = kitapAdi;
        this.kitapFiyat = kitapFiyat;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(int kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    @Override
    public String toString() {
        return
                "kitapNo=" + kitapNo +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat;
    }
}
