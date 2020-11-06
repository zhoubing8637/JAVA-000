package applications;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(40);
        final ServerSocket serverSocket = new ServerSocket(5678,1,
                InetAddress.getByName("127.0.0.1"));
        while (true) {
            try {
                final Socket socket = serverSocket.accept();
                executorService.execute(() -> service(socket));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void service(Socket socket) {
        OutputStream output = null;
        PrintWriter printWriter = null;
        try {
            //Thread.sleep(20);
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            System.out.println("HttpServer03 in service. remoteSocketAddress: " + remoteSocketAddress);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            output = socket.getOutputStream();

            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "hello,nio";
            printWriter.println("Content-Length:" + body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            String response = buildResponse("hello, nio");
            output.write(response.getBytes());
            String dum = "hello world";
            output.write(dum.getBytes());
            output.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String buildResponse(String message) {
        return "HTTP/1.1 " + 200 + "\r\n" +
                "Content-Type: text/html\r\n" +
                "Content-Length: " + message.length() + "\r\n" +
                "HelloMessage: " + message + "\r\n" +
                "\r\n" + message;
    }


        /*private static void service(Socket socket) {
        try {
            //Thread.sleep(20);
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            System.out.println("HttpServer03 in service. remoteSocketAddress: " + remoteSocketAddress);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "hello,nio";
            printWriter.println("Content-Length:" + body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
