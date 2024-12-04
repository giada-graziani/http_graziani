package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket s1= new ServerSocket(3000);

        do{
            Socket s= s1.accept();
            MioThread t1 = new MioThread(s);
            t1.start();

        }while(true);
    }
}