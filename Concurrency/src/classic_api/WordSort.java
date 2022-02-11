package classic_api;

import java.util.ArrayList;
import java.util.List;

public class WordSort {

    private  String [] sample = new String[100];

    String [] sample1 = {"aa"};

    public static void main(String[] args) {
        WordSort wordSort = new WordSort();
        System.out.println(wordSort.sample.length);
        System.out.println(wordSort.sample1.length);

        List<String> l = new ArrayList<>(3);
        System.out.println(l.size());
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        System.out.println(l.size());
    }
}
