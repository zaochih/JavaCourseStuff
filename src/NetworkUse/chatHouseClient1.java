package NetworkUse;

import java.io.IOException;
import java.net.*;

public class chatHouseClient1 {
    static void main() throws IOException {
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        DatagramSocket ds = new DatagramSocket(1145);

        IO.println("Client 1 已启动！开一个虚拟线程负责接收，主线程负责发送...");

        // 虚拟线程：死循环接收
        Thread.startVirtualThread(() -> {
            try {
                byte[] buf = new byte[1024];
                DatagramPacket receiveDp = new DatagramPacket(buf, buf.length);
                while (true) {
                    ds.receive(receiveDp);
                    String msg = new String(receiveDp.getData(), 0, receiveDp.getLength());
                    IO.println("\n[" + receiveDp.getAddress().getHostName() + ":" + receiveDp.getPort() + " 说] -> " + msg);
                }
            } catch (IOException e) {
                IO.println("接收通道已关闭。");
            }
        });

        // 主线程：直接用 IO.readln() 发送
        String newline = IO.readln();
        while (newline != null && !newline.isEmpty()) {
            byte[] data = newline.getBytes();
            DatagramPacket sendDp = new DatagramPacket(data, data.length, addr, 1146);
            ds.send(sendDp);
            newline = IO.readln();
        }

        ds.close();
    }
}
