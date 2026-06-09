package useArrBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class customThread {
    static void main() {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(20);

        Cook cook = new Cook(queue);
        Cook cook2 = new Cook(queue);
        Consumer consumer = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);

        cook.start();
        cook2.start();
        consumer.setName("Consumer 1");
        consumer.start();
        consumer2.setName("Consumer 2");
        consumer2.start();
    }
}
