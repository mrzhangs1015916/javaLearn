package Basic;

import java.io.Closeable;
import java.io.IOException;

public class TestAdd implements TestCreate, Closeable {
    public TestAdd(){

    }
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close");

    }
}
