
import java.net.*;

public class UDPClient {
    public static void main(String args[]){
        try{
            String m="I love my INDIA";
            byte b[]=m.getBytes();
            DatagramPacket dp=
 new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 2066);
            DatagramSocket ds=new DatagramSocket();
            ds.send(dp);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
