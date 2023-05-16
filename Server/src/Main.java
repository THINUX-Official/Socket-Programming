/*
    @author THINUX
    @created 13-May-23 - 10:50 
*/

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.println(message);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
