package rd.odev4;

public class PersonelListesi {
    public static void main(String[] args){

        Personel personel1 = new Personel();
        Personel personel2 = new Personel();
        Personel personel3 = new Personel();

        personel1.sicilno="NS001";
        personel1.adi="Ali";
        personel1.soyadi="Can";
        personel1.title="Müdür";
        personel1.yas=45;

        personel2.sicilno="NS002";
        personel2.adi="Veli";
        personel2.soyadi="Denizci";
        personel2.title="Takım Lideri";
        personel2.yas=35;

        personel3.sicilno="NS003";
        personel3.adi="Cem";
        personel3.soyadi="Kara";
        personel3.title="Uzman";
        personel3.yas=30;


        personel1.personelBilgileri();
        personel2.personelBilgileri();
        personel3.personelBilgileri();

    }
}
