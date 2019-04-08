package Basic;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CalUser {
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private int count =0;
    private ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();
    private static int own;
    static {
        System.out.println("CalUser");
        own = 10;
    }
    public CalUser(){

    }
    public void addCount(){
        try {
            writeLock.lock();
            count+=1;

        }
        finally {
            writeLock.unlock();

        }

    }
    public void addCount2(){
        count+=1;
    }
    public int getData(){
        try {
            readLock.lock();
            return this.count;

        }finally {
            readLock.unlock();

        }
    }
}
