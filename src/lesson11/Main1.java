package lesson11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("qqq");
        hashSet.add("qqq");
        hashSet.add("qqq");
        hashSet.add("eee");
        hashSet.add("yyy");
        hashSet.add("!!!");
        hashSet.add("6666");

        System.out.println(hashSet);


    }
}
