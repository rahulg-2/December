import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() throws IOException {
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Server is listening on port " + port);

        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Connected: " + client.getRemoteSocketAddress());

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String msg = in.readLine();
            System.out.println("Client says: " + msg);

            out.println("Hello from the server");

            in.close();
            out.close();
            client.close();
    }
}

    public static void main(String[] args) {
        System.out.println("Server is running in single-threaded mode.");
        try{
            Server server=new Server();
            server.run();
        }catch(IOException ex){
            ex.printStackTrace();
        }   


    }
}