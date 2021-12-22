///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package demo;
//
//import java.io.InputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// *
// * @author pvsla
// */
//public class SeverApplication {
//
//    public static void main(String[] aArgs){
//
//        //1. seversocket -port 8989
//        try {
//        ServerSocket severSocket = new ServerSocket(8777);
//            //while(true)
//            while (true) {
//                //2. accept connection
//                Socket clientSocket = severSocket.accept();
//                //3. read data from socket
//                InputStream inputStream = clientSocket.getInputStream();
//                int data = 0;
//                while ((data = Socket.getInputStream().read()) != -1) {
//                    System.out.print(String.valueOf((char) data));
//                }
//                //4. reply from server
//                clientSocket.getOutputStream().write("Uk. Chao ban".getBytes());
//                clientSocket.getOutputStream().flush();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
