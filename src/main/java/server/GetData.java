package server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import exchange_data.*;

public class GetData extends HttpServlet {
    static int flag;
    static Client client;
    static Server server;
//    public GetData() throws IOException {
//        flag = 1;
//        try {
//            client = new Client();
//        }catch (Exception e){
//            flag = 2;
//        }
//        try {
//            server = new Server();
//        }catch (Exception e){
//            flag = 3;
//        }
//    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = null;
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        if (request.getParameter("reset") != null){
            command = request.getParameter("reset");
            System.out.println(1);
        }
        else if (request.getParameter("emergency") != null){
            command = request.getParameter("emergency");
            System.out.println(2);
        }
        else if (request.getParameter("tirement") != null){
            command = request.getParameter("tirement");
            System.out.println(3);

        }
        else if (request.getParameter("music") != null){
            command = request.getParameter("music");
            System.out.println(4);
        }
        System.out.println(command);
//        if (flag == 1) {
//            client.send(command);
//        }
//        else if (flag == 2){
//            System.out.println(command);
//            System.out.println("2");
//            server.send(command);
//        }
        System.out.println("操作一次");
        response.sendRedirect("1.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
