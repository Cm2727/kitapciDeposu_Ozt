import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodlarveCaseler {

    static List<Depo> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapNumaratik = 1000;

    public static void anaMenu() {

        System.out.println("====================================\n\t "
                + "YILDIZ kITAP CENTER'A HOSGELDINIZ " +
                "\n===================================" +
                "\n============= İŞLEMLER ============\r\n     " +
                "1-KITAP EKLEME \r\n    " +
                " 2-NUMARA ILE KITAP ARAMA\r\n     " +
                "3-BILGI ILE KITAP ARAMA \r\n     " +
                "4-NUMARA ILE SİLME\r\n     " +
                "5-KITAP LISTELEME\r\n " +
                "    6-CIKIS");

        System.out.println("Lütfen yapmak istediginiz islemi girin.");

        int islem = scan.nextInt();

        switch (islem) {
            case 1:             //KITAP EKLEME
                kitapEkle();
                break;

            case 2:             //NUMARA ILE KITAP ARAMA

                numaraIleKitapArama();
                break;
            case 3:             //BILGI ILE KITAP ARAMA
                bilgiIleKitapArama();
                break;
            case 4:           //NUMARA ILE SİLME
                break;
            case 5:          //KITAP LISTELEME
                break;
            case 6:         //CIKIS
                break;

            default:

        }//switch sonu


    }

    private static void bilgiIleKitapArama() {
        System.out.println("Yazarin adi ile kitap aramak icin 1, " +
                "Kitap adi ile arama icin 2" +
                "fiyat ile arama icin 3");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Aradiginiz kitabin fiyatini giriniz");
                int ktbF=scan.nextInt();
                boolean varMi=true;
                for (int i = 0; i <kitapListesi.size() ; i++) {
                    if (ktbF==kitapListesi.get(i).getKitapFiyat()){

                        System.out.println("Kitap No: " + kitapListesi.get(i).getKitapNo());
                        System.out.println("Kitap adı: " + kitapListesi.get(i).getKitapAdi());
                        System.out.println("Kitap Yazarı: " + kitapListesi.get(i).getYazarAdi());
                        System.out.println("Kitap fiyatı: " + kitapListesi.get(i).getKitapFiyat());
                        varMi=false;

                    }else if (varMi=false){
                        System.out.println("Aradiginiz kitap bulunamadi");
                    }else System.out.println("Hatali veri girdiiz");

                }

                break;
            case 2:
                break;

            case 3:
                break;

            default:

        }




    }

    private static void numaraIleKitapArama() {
        System.out.println("Aradiginiz kitabin numarasini girin.");
        int tercih1=scan.nextInt();
        boolean varMi=true;

        for (int i = 0; i <kitapListesi.size() ; i++) {
            if (kitapListesi.get(i).getKitapNo()==tercih1){
                System.out.println("Kitap No: " + kitapListesi.get(i).getKitapNo());
                System.out.println("Kitap adı: " + kitapListesi.get(i).getKitapAdi());
                System.out.println("Kitap Yazarı: " + kitapListesi.get(i).getYazarAdi());
                System.out.println("Kitap fiyatı: " + kitapListesi.get(i).getKitapFiyat());

                varMi=false;

            }
        }
        if (varMi==true){
            System.out.println("Aradiginiz kitap bulunamadi.");
        }


    }

    public static void getKitap(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyat ){

    }

    public static void kitapEkle() {
        System.out.println("Yazar adi girin.");
        String yazarAdi = scan.nextLine();
        scan.nextLine();
        System.out.println("Kitap adi girin.");
        String kitapAdi = scan.nextLine();
        System.out.println("Kitap fiyatini girin.");
        int kitapFiyat = scan.nextInt();
        int kitapNo = kitapNumaratik;
        kitapNumaratik++;

        Depo k1 = new Depo(2000,"Hayat güzel", "Ahmet Can", 12);
        Depo k2 = new Depo(2001,"Matematik güzel", "Ali Kilic",13);
        Depo k3 = new Depo(2002,"Kimya güzel", "Ahmet Can", 15);
        Depo k4 = new Depo(2003,"Kimya güzel", "Ahmet Can", 10);
        Depo k5 = new Depo(2004,"Matematikl", "Ahmet Can", 14);
        Depo k6 = new Depo(2005,"Yasam", "Ahmet Can", 15);
        Depo k7 = new Depo(2006,"Güven", "Ahmet Can", 19);

        kitapListesi.add(k1);
        kitapListesi.add(k2);
        kitapListesi.add(k3);
        kitapListesi.add(k4);
        kitapListesi.add(k5);
        kitapListesi.add(k6);
        kitapListesi.add(k7);

        Depo yeniKitap = new Depo(kitapNo, kitapAdi, yazarAdi, kitapFiyat);
        kitapListesi.add(yeniKitap);
        islemeDevamDongusu();

    }

    private static void islemeDevamDongusu() {
        int tercih = 0;
        System.out.println("Devam etmek istiyorsaniz 1, cikmak istiyorsaniz 2 girin.");
        tercih=scan.nextInt();
        if (tercih==1) anaMenu(); else if (tercih==2)cikis();else System.out.println("Hatali veri girdiniz.");
        islemeDevamDongusu();
    }


    private static void cikis() {

        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz. Hoscakalin.");
    }
}
