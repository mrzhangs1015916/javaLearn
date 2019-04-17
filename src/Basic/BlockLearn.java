package Basic;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockLearn {
    public static void main(String[] args){
        BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<String>(500);
        for(int i=0;i<1000;i++){
            blockingQueue.offer(String.valueOf(i));
        }
        ExecutorService a1 = Executors.newFixedThreadPool(2);
        for(int i=0;i<2;i++){
            MyRunable myRunable = new MyRunable(blockingQueue);
            a1.submit(myRunable);
        }
    }

}
