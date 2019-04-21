package Basic;

import java.io.Closeable;
import java.io.IOException;

public class TestBase implements ChildBase, Closeable {
    public TestBase(){
        System.out.println("create instance");
    }
    @Override
    public int getData(int data) {
        return data * 2;
    }

    @Override
    public void showMessage(String s) {
        System.out.println(s+s);
    }

    @Override
    public void close() throws IOException {

    }
}
