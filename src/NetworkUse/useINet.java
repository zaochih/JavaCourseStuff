package NetworkUse;

import java.io.IOException;
import java.net.*;

public class useINet {
    static void main() throws IOException {
        InetAddress addr = InetAddress.getByName("127.0.0.1");

        IO.println(addr.getHostAddress());
        IO.println(addr.getHostName());

        DatagramSocket ds = new DatagramSocket();
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        String toBeSent = "Hello World!";

//        DatagramPacket dp = new DatagramPacket(toBeSent.getBytes(), toBeSent.length(), addr, 1145);

        dp.setData(toBeSent.getBytes());
        dp.setLength(toBeSent.length());
        dp.setAddress(addr);
        dp.setPort(1145);

        ds.send(dp);
        ds.close();
    }
}
