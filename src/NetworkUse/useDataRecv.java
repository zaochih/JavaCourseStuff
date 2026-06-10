package NetworkUse;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class useDataRecv {
    static void main() throws IOException {
        DatagramSocket ds = new DatagramSocket(1145);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        ds.receive(dp);
        byte[] data = dp.getData();
        InetAddress addr = dp.getAddress();
        int port = dp.getPort();

        IO.println(addr.getHostName() + ":" + port + " sent an packet:");
        IO.println(new String(data, 0, dp.getLength()));
    }
}
