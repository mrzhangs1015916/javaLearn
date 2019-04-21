package Basic;

import com.zs.Base;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ServiceLoader;

public class LearnServiceLoader {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ServiceLoader<Base> serviceLoader = ServiceLoader.load(Base.class);
        StringBuilder s = new StringBuilder();
        for(Base base:serviceLoader){
            s.delete(0,s.length());
            s.append(base.getClass().getName());
            s.append(":");
            base.showMessage("test");
            System.out.println(s.toString());
        }
        Class<?> c1 = Class.forName("Basic.TestBase");
        Class<?> c2 = c1.asSubclass(ChildBase.class);
        Constructor<?> constructor = c2.getDeclaredConstructor();
        ChildBase childBase = ChildBase.class.cast(constructor.newInstance());
        System.out.println(childBase.getClass().getName());
    }
}
