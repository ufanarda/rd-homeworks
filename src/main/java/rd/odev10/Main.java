package rd.odev10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("Ödev 10 - 1/2");

        GenericExample<String> GenericExample = new GenericExample<>();
        GenericExample.setText("Lorem Ipsum");
        GenericExample.printText();
        System.out.println("Return edilen text: "+ GenericExample.getText());

        System.out.println("==================================================");
        System.out.println("Ödev 10 - 2/2");


        StreamExample streamExample = new StreamExample();

        ArrayList searchlist = new ArrayList<>(Arrays.asList(55, true, 'A', "Marmara", "Kara Deniz", "Ege", "Ak Deniz", "İç Anadolu", "Doğu Anadolu", "Güneydoğu Anadolu", "İstanbul", "Ankara", "İzmir"));


        streamExample.searchlist(searchlist, "Ege");
        streamExample.searchlist(searchlist, "ege");  // Büyük küçük harf farkını engellemek için equals() yerine equalsIgnoreCase() kullanılabilir
        streamExample.searchlist(searchlist, "İstanbul");
        streamExample.searchlist(searchlist, "55");
        streamExample.searchlist(searchlist, "5");
        streamExample.searchlist(searchlist, "true");
        streamExample.searchlist(searchlist, "A");

    }


}
