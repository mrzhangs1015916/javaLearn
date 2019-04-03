package mapAndSet;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TreeMapTest {
    public static void main(String[] args){
        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        treeMap.clear();;
        treeMap.put("admin","zsd");
        treeMap.put("name","zs");
        treeMap.put("name","pd");
        treeMap.put("passwd","123456");
        System.out.println(treeMap.size());
        System.out.println(treeMap.containsKey("admin"));
        System.out.println(treeMap.firstKey());
        Iterator<Map.Entry<String,String>>iterator= treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> map = iterator.next();
            System.out.println(map.getKey()+":"+map.getValue());
        }
        TreeMap<Person,String> treePerson = new TreeMap<Person,String>();
        Person p1 = new Person(40,"zs");
        Person p2 = new Person(50,"ad");
        Person p3 = new Person(40,"zfg");
        Person p4 = new Person(20,"lk");
        treePerson.put(p1,"a");
        treePerson.put(p2,"b");
        treePerson.put(p3,"c");
        treePerson.put(p4,"d");
        Iterator<Map.Entry<Person,String>>iterators= treePerson.entrySet().iterator();
        while (iterators.hasNext()){
            Map.Entry<Person,String> map = iterators.next();
            System.out.println(map.getKey().toString());
        }
        ComparorPerson com= new ComparorPerson();
        TreeMap<Person,String> treePerson2 = new TreeMap<Person,String>(com);
        treePerson2.put(p1,"a");
        treePerson2.put(p2,"b");
        treePerson2.put(p3,"c");
        treePerson2.put(p4,"d");
        Iterator<Map.Entry<Person,String>>iterator2= treePerson2.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<Person,String> map = iterator2.next();
            System.out.println(map.getKey().toString());
        }
        
    }
}
