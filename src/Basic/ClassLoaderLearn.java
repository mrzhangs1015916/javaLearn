package Basic;


import mapAndSet.Person;
import sun.misc.Launcher;
import sun.net.www.ParseUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassLoaderLearn {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        System.out.println(Thread.currentThread().getContextClassLoader());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL[] urls = new URL[1];
        File file = new File("D:\\MyWork\\jar\\MyJar.jar");
        URL url = getFileURL(file);
        urls[0] = url;
        MyClassLoader myClassLoader = new MyClassLoader(urls);
        Class<?> test = myClassLoader.loadClass("com.zs.LoginInfo");
        Class<?> person = classLoader.loadClass("mapAndSet.Person");
//        Class<?> test = classLoader.loadClass("mapAndSet.User");
        if (test==null){
            System.out.println("not found");
            return;
        }
        if(person==null){
            System.out.println(String.format("%s not found","person"));
            return;
        }
        Constructor<?> constructor = person.getDeclaredConstructor(Integer.class,String.class);
        if(constructor==null){
            System.out.println("no constructor");
            return;
        }
        Person person1 = (Person)constructor.newInstance(18,"zs");
        Person person2 = (Person) person.newInstance();
        Object object =test.newInstance();
        System.out.println(object.toString());

        System.out.println(test);
        System.out.println(person1);
        System.out.println(person2);
    }
    public static URL getFileURL(File var0) {
        try {
            var0 = var0.getCanonicalFile();
        } catch (IOException var3) {
        }

        try {
            return ParseUtil.fileToEncodedURL(var0);
        } catch (MalformedURLException var2) {
            throw new InternalError(var2);
        }
    }
}
