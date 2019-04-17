package Basic;

import java.util.concurrent.BlockingQueue;

public class MyRunable implements Runnable {
    private BlockingQueue<String> blockingQueue;
    public MyRunable(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public BlockingQueue<String> getBlockingQueue() {
        return blockingQueue;
    }

    public void setBlockingQueue(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        if(blockingQueue==null){
            return;
        }
        String s= blockingQueue.poll();
        while(s!="" && s!=null) {
            System.out.println(s);
            System.out.println(Thread.currentThread().getName());
            s=blockingQueue.poll();
        }

    }
}
