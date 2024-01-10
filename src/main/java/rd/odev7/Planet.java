package rd.odev7;

public enum Planet {
    MERCURY(1, 57.81, 4884, 0.2),
    VENUS(2, 107.48, 12104, 0.6),
    EARTH(3, 151.75, 12742, 1),
    MARS(4, 227.9, 6791, 1.8),
    JUPITER(5, 778.89, 139822, 11.6),
    SATURN(6, 1500, 116464, 29.5),
    URANUS(7, 2940, 50724, 84.1),
    NEPTUNE(8, 4480, 49244, 164.8),
    PLUTO(9, 5934, 2390, 248.3);

    //sıralama numarasını, uzaklığı, yarıçapı, dönme süresini içeren bilgileri içermelidir


    private final int order;
    private final double distancefromsun;
    private final double size;
    private final double lenghtofyear;


    Planet(int order, double distancefromsun, double size, double lenghtofyear) {
        this.order = order;
        this.distancefromsun = distancefromsun;
        this.size = size;
        this.lenghtofyear = lenghtofyear;
    }

    public int getOrder() {
        return order;
    }

    public double getDistancefromsun() {
        return distancefromsun;
    }

    public double getSize() {
        return size;
    }

    public double getLenghtofyear() {
        return lenghtofyear;
    }


    public static String distance(double d) {
        if (d >= 1000) {
            return d + " Milyar kilometredir. ";
        } else
            return d + " Milyon kilometredir. ";
    }

    public static String gezegenAdi(Enum p){
        return p.toString().substring(0,1)+p.toString().substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        for (Planet p : Planet.values()) {
            String gezegenadi = p.toString().substring(0, 1) + p.toString().substring(1).toLowerCase();
            System.out.println(gezegenadi + " güneş sisteminin " + p.order + ". gezegenidir. Güneşe olan uzaklığı " + distance(p.distancefromsun) + "Yarı çapı " + p.size / 2 + " km. Güneş etrafında dönüş süresi " + p.lenghtofyear + " dünya yılıdır.  ");
        }

    }


}
