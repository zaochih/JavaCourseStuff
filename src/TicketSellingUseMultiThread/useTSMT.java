package TicketSellingUseMultiThread;

public class useTSMT {
    static void main() {
        Kiosk k1 = new Kiosk();
        Kiosk k2 = new Kiosk();
        Kiosk k3 = new Kiosk();
        k1.setName("A");
        k2.setName("B");
        k3.setName("C");
        k1.start();
        k2.start();
        k3.start();

    }
}
