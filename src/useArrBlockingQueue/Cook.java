package useArrBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                IO.println("面好了，现在有 " + queue.size() + " 碗在桌上。");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
