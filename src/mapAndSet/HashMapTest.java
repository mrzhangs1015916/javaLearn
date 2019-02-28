package mapAndSet;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<String, String>(4);
        map.put("admin","123456");
        map.put("test","12");
        map.put("abcd","34");
        map.put("zs","asd");
        map.put("zs","ppp");
        System.out.println(map);
        System.out.println(map.containsKey("admin"));
        System.out.println(map.containsValue("12"));
        System.out.println(map.get("admin"));
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        map.remove("test");
        System.out.println(map.size());
        Collection<String> collection = map.values();
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
