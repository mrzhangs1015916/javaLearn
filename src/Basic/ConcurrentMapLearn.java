package Basic;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapLearn {
    public static void main(String[] args){
        ConcurrentMap<String,String> test = new ConcurrentHashMap<String,String>();
        test.put("zs","zz");
        System.out.println(test.get("zs"));
        test.putIfAbsent("zs","bb");
        System.out.println(test.get("zs"));
        test.putIfAbsent("zd","bb");
        System.out.println(test.get("zd"));
    }
}
