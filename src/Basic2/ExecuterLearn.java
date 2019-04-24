package Basic2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterLearn {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        TestCall testCall = new TestCall("abc");
        Future<String> future = executorService.submit(testCall);
        System.out.println("furture begin");
        System.out.println(future.get());
        System.out.println("future over");
        TestRunable testRunable = new TestRunable();
        Future<?> future1 = executorService.submit(testRunable);
        System.out.println("runable begin");
        System.out.println(future1.get());
        System.out.println("runnable over");
        executorService.shutdown();

    }
}
