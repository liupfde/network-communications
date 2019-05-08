package server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import exchangedata.*;

/**
 * @author tandijie
 */
public class GetData extends HttpServlet {
    static int flag;
    static Client client;
    static Server server;

    @Override
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
        System.out.println("操作一次");
        response.sendRedirect("1.html");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
