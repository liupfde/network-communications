package exchangedata;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tandijie
 */
public class Server {
    static final int port = 10005;
    static Socket socket;
    static FileInputStream fis;
    static FileOutputStream fos;
    public Server()  throws IOException{
        ServerSocket serverSocket = new ServerSocket(port);
        socket = serverSocket.accept();
        fis = (FileInputStream)socket.getInputStream();
        fos = (FileOutputStream)socket.getOutputStream();
        System.out.println("连接成功");
    }
    public void send(String command) throws IOException {
        fos.write(command.getBytes());
        System.out.println("发送成功");
    }
    public void receve() throws IOException {
        GetFile getFile = new GetFile(fis);
    }
}
