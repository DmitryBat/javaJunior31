package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            arrayList.add("wfadsf"+i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("ArrayList Add: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            linkedList.add("wfadsf"+i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList Add: " + (end2 - start2));
        System.out.println((end1 - start1)/(end2 - start2));

        System.out.println("---------------");
        long start3 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            arrayList.get(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("ArrayList Get: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            linkedList.get(i);
        }
        long end4 = System.currentTimeMillis();
        System.out.println("LinkedList Get: " + (end4 - start4));

    }
}
