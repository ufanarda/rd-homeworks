package odev13;

import org.junit.Assert;
import rd.odev5.MaasHesaplama;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Odev5Test {

    MaasHesaplama maashesapla = new MaasHesaplama();

    @Test(groups = "PassTests")
    public void maasHesaplaTest() {
        assertEquals(maashesapla.maasHesapla(10), 100000);
    }

    @Test(groups = "FailTests")
    public void maasHesaplaTestHata() {
        assertEquals(maashesapla.maasHesapla(10), 100001);
        //SENARYONUN HATA ALDIĞININ GÖSTERİLEBİLMESİ İÇİN BİLEREK HATA ALACAK ŞEKİLDE YAZILDI
    }

    @Test(groups = "PassTests")
    public void primHesaplaTest() {
        assertEquals(maashesapla.primHesapla(50), 25000);
    }

    @Test(groups = "FailTests")
    public void primHesaplaTestHata() {
        assertEquals(maashesapla.primHesapla(50), 25001);
    }
        //SENARYONUN HATA ALDIĞININ GÖSTERİLEBİLMESİ İÇİN BİLEREK HATA ALACAK ŞEKİLDE YAZILDI
}
