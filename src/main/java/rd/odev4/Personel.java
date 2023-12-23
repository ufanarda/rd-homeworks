package rd.odev4;

public class Personel {

    String sicilno;
    String adi;
    String soyadi;
    String title;
    int yas;

    public void personelBilgileri(){
        System.out.println("Sicil Numarası: " + sicilno);
        System.out.println("Adi Soyadi: " + adi + " " + soyadi);
        System.out.println("Ünvanı: " + title);
        System.out.println("Yaşı: " + yas);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

}
