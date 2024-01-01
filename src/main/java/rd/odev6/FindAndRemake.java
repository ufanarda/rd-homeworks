package rd.odev6;

import java.util.*;

public class FindAndRemake {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("İstanbul", "Kara Deniz", "Ege", "Antalya", "İç Anadolu", "Doğu Anadolu", "Güneydoğu Anadolu"));



        // BÜYÜK/KÜÇÜK HARF AYRIMI BİLEREK YAPILDI. İKİNCİ METHOD DENEME AMACIYLA YAZILDI

        System.out.println(reorderLetters(words));
        System.out.println(reorderLetters2(words));

    }


    static ArrayList<String> findRepeatedWords(ArrayList<String> words) {
        char word[];
        ArrayList<String> choosenwords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i).toCharArray();
            if (checkRepeatedLetters(word) && choosenwords.size() < 2) {
                choosenwords.add(String.valueOf(word).replace(" ", ""));
            }
        }

        return choosenwords;
    }

    static boolean checkRepeatedLetters(char[] list) {
        boolean flag = false;
        char cl;

        for (int i = 0; i < list.length; i++) {
            cl = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (cl == list[j] && cl != ' ') {
                    flag = true;
                }
            }
        }
        return flag;
    }


    static String reorderLetters(ArrayList<String> choosenwords) {

        Random r = new Random();
        List<Character> charList = new ArrayList<>();
        String result = "";

        for (char c : String.join("", findRepeatedWords(choosenwords)).toCharArray()) {
            charList.add(c);
        }

        if (findRepeatedWords(choosenwords).size() == 2) {
            while (charList.size() > 0) {
                int i = r.nextInt(charList.size());
                result += charList.get(i);
                charList.remove(i);
            }
        } else
            result = "DEFAULT: YETERLİ MİKTARDA TEKRARLAYAN METİN BULUNAMADI";

        return result;
    }


    static String reorderLetters2(ArrayList<String> choosenwords) {

        String result = "";
        List<Character> charList = new ArrayList<>();
        for (char c : String.join("", findRepeatedWords(choosenwords)).toCharArray()) {
            charList.add(c);
        }


        if (findRepeatedWords(choosenwords).size() == 2) {
            Collections.shuffle(charList);
            for (char character : charList) {
                result += character;
            }
        } else
            result = "DEFAULT: YETERLİ MİKTARDA TEKRARLAYAN METİN BULUNAMADI";

        return result;
    }


}
