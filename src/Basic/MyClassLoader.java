package Basic;

import java.net.URL;
import java.net.URLClassLoader;

public class MyClassLoader extends URLClassLoader {
    private String path;
    public MyClassLoader(URL[] urls) {
        super(urls);
    }
}
