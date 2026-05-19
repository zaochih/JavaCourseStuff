package useThread;

public class customThreadImplRunnable implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        IO.println("Thread " + thread.getName() + " is running");
    }
}
