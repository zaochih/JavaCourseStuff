package NetworkUse;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class chatHouseClient1 {
    public static void main(String[] args) throws IOException {
        // 自己监听的端口：1145
        DatagramSocket ds = new DatagramSocket(1145);

        // 目标地址和端口：127.0.0.1 : 1146
        InetAddress destAddr = InetAddress.getByName("127.0.0.1");
        int destPort = 1146;

        IO.println("Client 1 已启动，可以开始打字聊天了...");

        // 启动接收线程 (后台运行)
        new Thread(new ReceiverTask(ds)).start();

        // 启动发送任务 (直接在主线程运行，或者也丢进 Thread 里)
        // 主线程会卡在键盘输入这里，但接收线程不受影响
        new SenderTask(ds, destAddr, destPort).run();
    }
}
