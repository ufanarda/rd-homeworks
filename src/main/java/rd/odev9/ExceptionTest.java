package rd.odev9;


public class ExceptionTest {

    public static void main(String[] args) {

        ExceptionMethods exceptiontest = new ExceptionMethods();


        System.out.println("====================================");
        System.out.println("====================================");

        System.out.println("HATA ALMAMA DURUMU");
        exceptiontest.ExceptionMethods(3, "Test");

        System.out.println("====================================");
        System.out.println("====================================");

        System.out.println("ArrayIndexOutOfBoundsException DURUMU");
        exceptiontest.ExceptionMethods(6, "Test");

        System.out.println("====================================");
        System.out.println("====================================");

        System.out.println("FileNotFoundException DURUMU");
        exceptiontest.ExceptionMethods(2, "Test2");

        System.out.println("====================================");
        System.out.println("====================================");

        System.out.println("NumberFormatException DURUMU");
        exceptiontest.ExceptionMethods(1, "Test");


    }

}
