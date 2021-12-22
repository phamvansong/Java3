/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.net.InetAddress;

/**
 *
 * @author pvsla
 */
public class DemoIP {

    public static void main(String[] args) {
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println("Host address: " + myHost.getHostAddress());
            System.out.println("Host name: " + myHost.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
