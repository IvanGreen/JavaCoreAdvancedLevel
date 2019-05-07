package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>(20);

        words.add("oil");
        words.add("gaz");
        words.add("crown");
        words.add("minerals");
        words.add("gold");
        words.add("water");
        words.add("earth");
        words.add("mountains");
        words.add("country");
        words.add("thieves");
        words.add("sorrow");
        words.add("courage");
        words.add("scream");
        words.add("send");
        words.add("leave");
        words.add("thieves");
        words.add("thieves");
        words.add("scream");
        words.add("sorrow");
        words.add("leave");

        repeat(unique(words),words);

        System.out.println("\n\n");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov","+7(777)-77-77");
        phoneBook.add("Petrov","+8(888)-88-88");
        phoneBook.add("Sidorov","+9(999)-99-99");
        phoneBook.add("Ivanov","+7(777)-77-78");
        phoneBook.add("Chizhikov","+1(111)-11-11");
        phoneBook.add("Erevanov","+6(666)-66-66");
        phoneBook.add("Chizhikov","+2(222)-22-22");

        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");
        phoneBook.get("Chizhikov");

        System.out.println("\n\n");

        phoneBook.info();
    }

    public static void repeat (ArrayList ready,ArrayList words){
        for (int i = 0; i < ready.size(); i++){
             int count = Collections.frequency(words,ready.get(i));
             System.out.println("A word " + '"' + ready.get(i) + '"' + " is found " + count + " time");
        }
    }

    public static ArrayList<String> unique (ArrayList words){
        HashSet<String> set = new HashSet<>(words);
        ArrayList<String> result = new ArrayList<>(set);
        System.out.println("\n\n"+ "Unique words: " + result + "\n\n");
        return result;
    }
}
