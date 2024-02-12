package odev13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rd.odev5.MaasHesaplama;

import static org.testng.Assert.assertEquals;

public class Odev5TestWithDataProvider {

    MaasHesaplama maashesapla = new MaasHesaplama();
    @Test(groups = "PassTests", dataProvider = "maasdata")
    public void maasHesaplaTest(int a, int b){
        assertEquals(maashesapla.maasHesapla(a), b);
    }

    @Test(groups = "PassTests", dataProvider = "primdata")
    public void primHesaplaTest(int a, int b)
    {
        assertEquals(maashesapla.primHesapla(a), b);
    }

    @DataProvider(name = "maasdata")
    public Object[][] maasdata(){
        return new Object[][]{{10,100000},{20,200000}};

    }

    @DataProvider(name = "primdata")
    public Object[][] primdata(){
        return new Object[][]{{25,0},{50,25000}};

    }


}
