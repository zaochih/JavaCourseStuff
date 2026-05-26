package TicketSellingUseMultiThread;

public class TicketManager {
    private static int remains = 100;
    public static synchronized boolean sell(String kioskName) {
        if (remains > 0) {
            remains--;
            IO.println("窗口 " + kioskName + " 售出了一张票，剩余票数：" + remains);
            return true;
        } else return false;
    }
}
