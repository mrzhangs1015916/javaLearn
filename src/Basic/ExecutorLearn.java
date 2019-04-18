package Basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorLearn {
    public static void main(String[] args){
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    System.out.println("t1 over");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("t1 exception");
                }
            }
        };
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("t2 over");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("t2 exception");
                }
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("wait over");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("overtime exception");
        }
        executorService.shutdownNow();
    }
}
