package Basic2;

public class TestRunable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("runnable over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
