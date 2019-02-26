package mapAndSet;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String [] args){
        System.out.println("ArrayList");
        List<String> str = new ArrayList<String>();
        str.add("admin");
        str.add("test");
        str.add(1,"insert");
        System.out.println(str);
        System.out.println(str.contains("admin"));
        System.out.println(str.indexOf("test"));
        System.out.println(str.get(1));
        System.out.println(str.size());
        str.remove(0);
        System.out.println(str);
    }
}
