package Day1;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        insertFirst();

    }
    // insert link at the first location
    public static void insertFirst(){
        // create a linkedlist
        LinkedList<Integer> list = new LinkedList<>();
        String [] names = {"Alice", "Bob", "Charlie"};
        // Add some elements to the linkedlist
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList : "+list);
        LinkedList<String> stringlist = new LinkedList<>(Arrays.asList(names));
        System.out.println("String linkedlist : "+stringlist);
        // insertAt beginning



    }
}
