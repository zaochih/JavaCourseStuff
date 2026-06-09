package grabRedPockets;

public class useGrab {
    static void main() {
        grab g1 = new grab("A");
        grab g2 = new grab("B");
        grab g3 = new grab("C");
        grab g4 = new grab("D");
        grab g5 = new grab("E");

        g1.start();
        g2.start();
        g3.start();
        g4.start();
        g5.start();
    }
}
