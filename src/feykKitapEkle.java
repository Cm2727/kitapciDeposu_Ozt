import java.util.ArrayList;

public class feykKitapEkle {

    public static void feykKitapEkle() {

        Depo k1 = new Depo(1000, "Ahmet Can","Hayat güzel",  12);
        Depo k2 = new Depo(1001, "Ali Kilic","Matematik güzel",  13);
        Depo k3 = new Depo(1002, "Ahmet Can","Kimya güzel",  15);
        Depo k4 = new Depo(1003, "Ahmet Can","Kimya güzel",  10);
        Depo k5 = new Depo(1004, "Ahmet Can","Matematikl",  14);
        Depo k6 = new Depo(1005, "Ahmet Can","Yasam",  15);
        Depo k7 = new Depo(1006, "Ahmet Can","Güven",  19);

        MetodlarveCaseler.kitapListesi.add(k1);
        MetodlarveCaseler.kitapListesi.add(k2);
        MetodlarveCaseler.kitapListesi.add(k3);
        MetodlarveCaseler.kitapListesi.add(k4);
        MetodlarveCaseler.kitapListesi.add(k5);
        MetodlarveCaseler.kitapListesi.add(k6);
        MetodlarveCaseler.kitapListesi.add(k7);

    }


}
