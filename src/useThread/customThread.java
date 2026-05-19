package useThread;

public class customThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 99; i ++) {
            IO.println("Thread " + this.getName() + " is running: " + i);
        }
    }
}
