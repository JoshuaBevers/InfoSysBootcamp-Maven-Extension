package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class arrayList {
    public static List<String> elementalList = new ArrayList<>();

    public static void arrays(String args[]) {
        elementalList.add("hello");
        elementalList.add("Josh");
        System.out.println(elementalList);
        printList(elementalList);
        System.out.println(elementalList.get(0));
        elementalList.set(0, "bye");
        elementalList.remove(1);
        elementalList.add("this");
        elementalList.set(1, "5");
        elementalList.add("Josh");
        System.out.println(" added elements ");

        printList(elementalList);
        Collections.sort(elementalList);
        System.out.println(" sorted list ");
        printList(elementalList);
        System.out.println("reversing list  ");

        Collections.reverse(elementalList);
        printList(elementalList);
        System.out.println("swapping 1 and 3.  ");

        Collections.swap(elementalList, 0, 2);
        printList(elementalList);
        System.out.println("cloning list     ");

        List<String> clone = new ArrayList<String>(elementalList);
        printList(clone);


    }

    private static void printList(List<String> list) {
        System.out.println("enhanced for loop");
        for (String n : list) {
            System.out.println(n);
        }
        System.out.println("normal for loop");
        for (int n = 0; n < list.size(); n++) {
            System.out.println(list.get(n));
        }
    }
}

