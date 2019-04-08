package Basic;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockLearn {
    public static void main(String[] args){
     CalUser calUser1 = new CalUser();
     CalUser calUser2 = new CalUser();
     Thread t1 = new Thread(new Runnable() {
         @Override
         public void run() {
             for(int i=0;i<50;i++){
                 calUser1.addCount();
                 System.out.println(Thread.currentThread().getName()+":"+calUser1.getData());
             }
         }
     });
     t1.setName("t1");
     t1.start();
     Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<50;i++){
                    calUser1.addCount();
                    System.out.println(Thread.currentThread().getName()+":"+calUser1.getData());
                }
            }
        });
     t2.setName("t2");
     t2.start();
     Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                calUser2.addCount();
                System.out.println(Thread.currentThread().getName()+":"+calUser2.getData());
            }
        }
     });
     t3.setName("t3");
     t3.start();
    }
}
