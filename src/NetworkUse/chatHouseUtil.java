package NetworkUse;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 专门负责发送的线程任务
class SenderTask implements Runnable {
    private DatagramSocket ds;
    private InetAddress destAddr;
    private int destPort;

    public SenderTask(DatagramSocket ds, InetAddress destAddr, int destPort) {
        this.ds = ds;
        this.destAddr = destAddr;
        this.destPort = destPort;
    }

    @Override
    public void run() {
        try {
            // 假设 IO.readln() 是你自定义的读取方法，也可以换成 Scanner scanner = new Scanner(System.in);
            String newline = IO.readln();
            while (newline != null && !newline.isEmpty()) {
                byte[] data = newline.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length, destAddr, destPort);
                ds.send(dp);
                newline = IO.readln();
            }
            ds.close(); // 如果退出循环，关闭 Socket
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 专门负责接收的线程任务
class ReceiverTask implements Runnable {
    private DatagramSocket ds;

    public ReceiverTask(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            while (true) {
                ds.receive(dp);
                String msg = new String(dp.getData(), 0, dp.getLength());
                InetAddress remoteAddr = dp.getAddress();
                int port = dp.getPort();

                // 打印收到的消息，加个换行和箭头以便区分自己发的和收到的
                IO.println("\n[收到来自 " + remoteAddr.getHostName() + ":" + port + " 的消息] -> " + msg);
            }
        } catch (IOException e) {
            // 当 ds 被关闭时，receive() 会抛出异常跳出死循环，这是正常现象
            IO.println("接收线程已退出。");
        }
    }
}