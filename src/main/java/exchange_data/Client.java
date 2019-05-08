package exchange_data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    static final int port = 10005;
    static Socket socket;
    static FileInputStream fis;
    static FileOutputStream fos;

    public Client() throws IOException {
        System.out.println("开始连接");
        socket = new Socket(InetAddress.getLocalHost().getHostAddress(),port);
        fis = (FileInputStream)socket.getInputStream();
        fos = (FileOutputStream)socket.getOutputStream();
        System.out.println("连接成功");
    }
    public void send(String command) throws IOException{
        fos.write(command.getBytes());
        System.out.println("发送成功");
    }
    public void receve() throws IOException {
        GetFile getFile = new GetFile(fis);
    }
}
