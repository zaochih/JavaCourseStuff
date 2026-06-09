package useArrBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread {
    ArrayBlockingQueue<String> queue;

    Consumer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
                IO.println(food + " good good by " + this.getName());
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
