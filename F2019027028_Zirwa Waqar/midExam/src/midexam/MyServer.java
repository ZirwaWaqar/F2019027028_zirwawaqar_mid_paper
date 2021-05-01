/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(73);
            while (true) {
                Socket s = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream());
                //DataOutputStream dout= new DataOutputStream(s.getDataOutputStream());

                String str = (String) dis.readUTF();
                System.out.println("message= " + str);
                if (str.equalsIgnoreCase("end")) {
                    ss.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
