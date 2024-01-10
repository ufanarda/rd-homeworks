package rd.odev7;

import static rd.odev7.Planet.distance;
import static rd.odev7.Planet.gezegenAdi;

public class PlanetTest {

    public static void main(String[] args) {


        for(Planet p : Planet.values()){
            System.out.println(gezegenAdi(p)+" güneş sisteminin "+p.getOrder()+". gezegenidir. Güneşe olan uzaklığı "+distance(p.getDistancefromsun())+"Yarı çapı "+p.getSize()/2+" km. Güneş etrafında dönüş süresi "+p.getLenghtofyear()+" dünya yılıdır.  ");
        }
    }
}
