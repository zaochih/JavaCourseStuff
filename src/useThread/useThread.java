package useThread;

public class useThread {
    static void main() {
        customThread ct = new customThread();

        ct.setName("Thread one");
        ct.start();

        customThread ct2 = new customThread();
        ct2.setName("Thread two");
        ct2.start();
    }
}
