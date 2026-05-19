package useThread;

public class runnable {
    static void main() {
        customThreadImplRunnable ctir = new customThreadImplRunnable();
        Thread t = new Thread(ctir);

        t.setName("Thread name");
        t.start();
    }
}
