package grabRedPockets;

import java.util.concurrent.ThreadLocalRandom;

public class grab extends Thread {
    static double money = 100;
    static int count = 3;
    static final double min = 0.01;

    public grab(String s) {
        this.setName(s);
    }

    @Override
    public void run() {
        synchronized (grab.class) {
            if (count == 0) {
                IO.println(this.getName() + " 您来晚了，红包派完了。");
            } else {
                double moneyGet = 0;
                if (count == 1) {
                    moneyGet = money;
                } else {
                    moneyGet = ThreadLocalRandom.current().nextDouble(min, (money - (count - 1) * min));
                }
                money -= moneyGet;
                count -= 1;
                IO.println(this.getName() + "抢到了 " + moneyGet + " 元");
            }
        }
    }
}
