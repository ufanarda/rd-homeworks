package rd.odev9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ExceptionMethods {


    public void ExceptionMethods(int index, String filename) {
        try {

            ArrayList<String> list = new ArrayList<>(Arrays.asList("TestText", "13.11.1984", "5", "65"));

            System.out.println("Listeden gelen: " + list.get(index));

            int number = Integer.parseInt(list.get(index));

            System.out.println("Integer değerine dönüştürülen :" + number);


            File file = new File("inputFiles/" + filename + ".text");
            FileReader fr = new FileReader(file);

        } catch (IndexOutOfBoundsException a) {
            System.out.println("Aranan index bulunamadı: " + a.getMessage());
        } catch (FileNotFoundException f) {
            System.out.println("Dosya bulunamadı hatası: " + f.getMessage());
        } catch (NumberFormatException n) {
            System.out.println("String integer yapılmak istendi: " + n.getMessage());
        }

    }


    public void fileNotFound(String filename) {
        try {
            File file = new File("inputFiles/" + filename + ".text");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı hatası alındı:" + e.getMessage());
        }

    }
}
