package NetworkUse;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class chatHouseClient2 {
    public static void main(String[] args) throws IOException {
        // 自己监听的端口：1146
        DatagramSocket ds = new DatagramSocket(1146);

        // 目标地址和端口：127.0.0.1 : 1145
        InetAddress destAddr = InetAddress.getByName("127.0.0.1");
        int destPort = 1145;

        IO.println("Client 2 已启动，可以开始打字聊天了...");

        // 启动接收线程
        new Thread(new ReceiverTask(ds)).start();

        // 启动发送任务
        new SenderTask(ds, destAddr, destPort).run();
    }
}
