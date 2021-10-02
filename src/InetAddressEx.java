
import java.net.*;
public class InetAddressEx {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress i=InetAddress.getLocalHost();
        //InetAddress i=InetAddress.getByName("www.google.com");
        System.out.println(i.getHostAddress());
        System.out.println(i.getHostName());
    }
}
