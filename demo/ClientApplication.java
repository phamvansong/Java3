/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 *
 * @author pvsla
 */
public class ClientApplication {

    public static void main(String[] args){
        try {
            Socket socket = new Socket("localhost", 8777);
            //write data => stream
            socket.getOutputStream().write("Xin Chao".getBytes());
            socket.getOutputStream().flush();
            //read date from socket
            int data = 0;
            while ((data = socket.getInputStream().read()) != -1) {
                System.out.print(String.valueOf((char) data));
            }
            socket.getInputStream().read();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
