import java.net.InetSocketAddress;
import java.net.Socket;

public class PortScan {
    public static void main(String[] args) {
        String host = "localhost";
        int timeout = 200;

        for (int port = 1; port <= 65535; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), timeout);
                System.out.println("Porta " + port + " aberta.");
                socket.close();
            } catch (Exception ex) {
                // A porta está fechada ou ocorreu algum erro
            }
        }
    }
}
