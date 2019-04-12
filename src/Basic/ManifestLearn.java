package Basic;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class ManifestLearn {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Mywork\\javaLearn\\src\\Basic\\MANIFEST.MF");
        System.out.println(file.getAbsolutePath());
        InputStream inputStream = new FileInputStream(file);
        Manifest manifest = new Manifest(inputStream);
        Attributes attributes = manifest.getMainAttributes();
        Set<Map.Entry<Object,Object>> entries = attributes.entrySet();
        for(Map.Entry<Object,Object> map : entries){
            System.out.println(map.getKey()+":"+map.getValue());
        }
        Map<String,Attributes> entry = manifest.getEntries();
        Set<String> keys = entry.keySet();
        List<String> list = new ArrayList<String>(keys);

        for(String key : list){
            System.out.println(key);
            Attributes tmp = entry.get(key);
            Set<Map.Entry<Object,Object>> tmpEntry = tmp.entrySet();
            for(Map.Entry<Object,Object> map : tmpEntry){
                System.out.println(map.getKey()+":"+map.getValue());
            }
        }

    }
}
