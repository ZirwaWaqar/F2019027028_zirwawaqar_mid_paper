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

/**
 *
 * @author Waqar
 */
public class MyClient {
    public static void main(String[] args) {
        try{           
        Socket s =new Socket("127.0.0.1",73);//clint need port and ip address
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());//used write data
        dout.writeUTF("Hello Server I am Client");
        ServerSocket ss =new ServerSocket();
        //DataInputStream din=new DataInputStream(ss.getDataInputStream());
        dout.close();
        s.close();
        }catch(Exception e)
        {
            
        }
    }
}
