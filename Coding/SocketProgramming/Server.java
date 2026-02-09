package SocketProgramming;
import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5050)){
            System.out.println("Server is listening on port 5050");
            for(;;){
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");
                new ClientHandler(clientSocket).start();        
            }
        }
        catch(IOException ioex){
            ioex.printStackTrace();
        }

    }
}

class ClientHandler extends Thread{
    private Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try(BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true)){
                String text;
                while((text = input.readLine())!= null){
                    System.out.println("Received: " + text);
                    output.println("Server echo: "+ text);
                }
            }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
