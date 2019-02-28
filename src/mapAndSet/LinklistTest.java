package mapAndSet;

import java.util.LinkedList;
import java.util.List;

public class LinklistTest {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("admin");
        list.addFirst("first");
        list.addLast("last");
        list.add(1,"insert");
        System.out.println(list.contains("insert"));
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("admin"));
        System.out.println(list.offerFirst("first"));
        System.out.println(list.peek());
        System.out.println(list.poll());
        list.remove("insert");
        list.pop();
        list.removeFirst();
        list.removeFirstOccurrence("last");
        System.out.println(list);

    }
}
