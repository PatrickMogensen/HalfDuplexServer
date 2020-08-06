package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            ServerSocket  serverSocket = new ServerSocket(6780);

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(isr);
            Scanner scanner = new Scanner(System.in);


            while (true){
            pw.println(scanner.nextLine());
                System.out.println(bufferedReader.readLine());

            }
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
