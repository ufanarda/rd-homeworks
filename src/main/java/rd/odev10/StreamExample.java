package rd.odev10;

import java.util.ArrayList;

public class StreamExample {

    public void searchlist(ArrayList searchlist, String parameter){

        String searchResult = searchlist.stream().filter(x -> parameter.equals(x.toString())).findFirst().orElse("-1").toString();

        System.out.println("\"" + parameter + "\" için arama sonucu: " + searchResult);

    }


}
