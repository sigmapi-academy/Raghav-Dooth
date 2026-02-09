package SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5050);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Connected to server. Type messages: ");
            String msg;
            while(!(msg = input.readLine()).equalsIgnoreCase("exit")){
                output.println(msg);
                String reply = serverInput.readLine();
                System.out.println(reply);
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
