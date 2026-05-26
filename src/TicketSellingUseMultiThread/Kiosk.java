package TicketSellingUseMultiThread;

public class Kiosk extends Thread {
    @Override
    public void run() {
        while (true) {
            boolean success = TicketManager.sell(this.getName());
            if (!success) {
                IO.println("已售空。");
                break;
            }
        }
    }
}
