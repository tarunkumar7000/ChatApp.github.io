
import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main(String args[]){
        try{
            DatagramSocket ds=new DatagramSocket(2066);
            byte b[]=new byte[1000];
            DatagramPacket dp=new DatagramPacket(b, b.length);
            ds.receive(dp);
            System.out.println(new String(dp.getData()));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
