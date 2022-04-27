import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MetodlarveCaseler {

    static List<Depo> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapNumaratik = 1007;

    public static void anaMenu() throws InterruptedException {
        feykKitapEkle.feykKitapEkle();
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

        int islem = 0;
        while(true) {
            try {
                islem = scan.nextInt();
                if (islem <= 0 || islem > 6) {
                    System.out.println("Tercihleriniz 1 ile 6 arasi olmali");
                } else break;
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("Lütfen numerik veri giriniz.");
                //throw new RuntimeException(e);
            }
        }

        switch (islem) {
            case 1:             //Kitap ekleme
                kitapEkle();
                break;

            case 2:             //Numara ile kitap arama
                numaraIleKitapArama();
                break;
            case 3:             //Bilgi ile kitap arama
                bilgiIleKitapArama();
                break;
            case 4:             //Numara ile silme
                numaraIleSilme();

                break;
            case 5:             //Kitap listeleme
                Kitaplisteleme();

                break;
            case 6:             //cikis
                cikis();
                break;

            default:
                System.out.println("Hatali veri girdiniz");
                islemeDevamDongusu();

        }//switch sonu


    }

    private static void numaraIleSilme() throws InterruptedException {
        System.out.println("Silmek istediginiz kitabin nosunu girin.");
        int kkS = scan.nextInt();
        int kontrol5 = 0;
        for (Depo kS : kitapListesi) {
            if (kS.getKitapNo() == kkS) {
                kitapListesi.remove(kS);
                System.out.println("silindi.");
                kontrol5++;
                break;
            }
        }
        if (kontrol5 == 0) {
            System.out.println("Aradiginiz kitap bulunamamistir.");
        }

        else islemeDevamDongusu();

    }

    private static void Kitaplisteleme() throws InterruptedException {
        System.out.println("Kitaplar listeleniyor");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
             Thread.sleep(1000);

        }
        System.out.println(" ");
        for (Depo kk : kitapListesi) {
            System.out.println(kk.toString());
        }

        islemeDevamDongusu();
    }

    private static void bilgiIleKitapArama() throws InterruptedException {
        System.out.println("Yazarin adi ile kitap aramak icin 1,\n Kitap adi ile arama icin 2,\n Fiyat ile arama icin 3");

        int secim = scan.nextInt();

        switch (secim) {
            case 1: // yazar adi ile arama

                scan.nextLine();
                System.out.println("Aradiginiz kitabin yazar adini girin.");
                String yA = scan.nextLine();
                int kontrol = 0;
                for (Depo yAA : kitapListesi) {
                    if (yAA.getYazarAdi().equalsIgnoreCase(yA)) {
                        System.out.println(yAA.toString());
                        kontrol++;
                    }
                }
                if (kontrol == 0) {
                    System.out.println("Aradiginiz yazar bulunamamistir.");
                }
                islemeDevamDongusu();
                break;
            case 2:// Kitap adi ile arama
                scan.nextLine();
                System.out.println("Aradiginiz kitabin adini girin.");
                String kA = scan.nextLine();
                int kontrol2 = 0;
                for (Depo kAA : kitapListesi) {
                    if (kAA.getKitapAdi().equalsIgnoreCase(kA)) {
                        System.out.println(kAA.toString());
                        kontrol2++;
                    }
                }
                if (kontrol2 == 0) {
                    System.out.println("Aradiginiz kitap bulunamamistir.");
                }
                islemeDevamDongusu();
                break;
            case 3://fiyat ile arama
                scan.nextLine();
                System.out.println("Aradiginiz kitabin fiyatini giriniz");
                int ktbF = scan.nextInt();
                int kontrol3 = 0;
                for (Depo kf : kitapListesi) {
                    if (kf.getKitapFiyat() == ktbF) {
                        System.out.println(kf.toString());
                        kontrol3++;
                    }
                }
                if (kontrol3 == 0) {
                    System.out.println("Aradiginiz kitap bulunamamistir.");
                }
                islemeDevamDongusu();
                break;
            default:
                System.out.println("Hatali veri girdiniz");
                islemeDevamDongusu();

        }


    }

    private static void numaraIleKitapArama() throws InterruptedException {

        System.out.println("Aradiginiz kitabin numarasini girin.");
        int kontrol4 = 0;
        int ktpNo = scan.nextInt();
        for (Depo k : kitapListesi) {
            if (k.getKitapNo() == ktpNo) {
                System.out.println(k.toString());
                kontrol4++;
            }
        }
        if (kontrol4 == 0) {
            System.out.println("Aradiginiz kitap bulunamamistir.");
        }
        islemeDevamDongusu();
    }

    public static void kitapEkle() throws InterruptedException {
        System.out.println("Yazar adi girin.");
        scan.nextLine();
        String yazarAdi = scan.nextLine();
        System.out.println("Kitap adi girin.");
        String kitapAdi = scan.nextLine();
        System.out.println("Kitap fiyatini girin.");
        int kitapFiyat = scan.nextInt();
        int kitapNo = kitapNumaratik;
        kitapNumaratik++;
        Depo yeniKitap = new Depo(kitapNo, yazarAdi, kitapAdi, kitapFiyat);
        kitapListesi.add(yeniKitap);

        System.out.println("Kitap eklemek istiyorsan 1, ana menuye donmek istiyorsan 2 yazin.");
        int t1 = scan.nextInt();
        if (t1 == 1) {
            kitapEkle();
        } else if (t1 == 2) {
            anaMenu();
        } else System.out.println("Hatali girdiniz.");

    }


    private static void islemeDevamDongusu() throws InterruptedException {
        int tercih = 0;
        System.out.println("Devam etmek istiyorsaniz 1, cikmak istiyorsaniz 2 girin.");
        tercih = scan.nextInt();
        if (tercih == 1) anaMenu();
        else if (tercih == 2) cikis();
        else System.out.println("Hatali veri girdiniz.");
        islemeDevamDongusu();

    }


    private static void cikis() {

        System.out.println(" Programdan ciktiniz");
        System.exit(0);
    }
}

