package Basic2;

import java.util.concurrent.Callable;

public class TestCall implements Callable<String> {
    private String str;
    public TestCall(String s){
        this.str = s;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println("call over");
        return str.toUpperCase();
    }
}
