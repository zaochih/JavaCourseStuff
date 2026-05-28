package TicketSellingUseMultiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    static int ticket = 0;
//    static Lock lock = new ReentrantLock();
    static Object ObjA = new Object();
    static Object ObjB = new Object();

    @Override
    public void run() {
        synchronized (ObjA) {
            System.out.println("");
        }
    }
}
