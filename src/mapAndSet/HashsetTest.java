package mapAndSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
    public static void main(String [] args){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("admin");
        hashSet.add("zs");
        hashSet.add("zs");
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("zs"));
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        hashSet.remove("zs");
        System.out.println(hashSet);
    }
}
