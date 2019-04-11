package Basic;


import sun.misc.Launcher;
import sun.net.www.ParseUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassLoaderLearn {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        System.out.println(Thread.currentThread().getContextClassLoader());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL[] urls = new URL[1];
        File file = new File("D:\\MyWork\\jar\\MyJar.jar");
        URL url = getFileURL(file);
        urls[0] = url;
        MyClassLoader myClassLoader = new MyClassLoader(urls);
        Thread.currentThread().setContextClassLoader(myClassLoader);
        Class<?> test = myClassLoader.loadClass("com.zs.LoginInfo");
//        Class<?> test = classLoader.loadClass("mapAndSet.User");
        if (test==null){
            System.out.println("not found");
            return;
        }
//        Constructor<?> constructor = test.getDeclaredConstructor(String.class,Integer.class);
//        if(constructor==null){
//            System.out.println("no constructor");
//        }
        Object object =test.newInstance();
        System.out.println(object.toString());

        System.out.println(test);
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
