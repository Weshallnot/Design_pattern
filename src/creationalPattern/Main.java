package creationalPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.0.3");
        networkConnection.loadVeruImportantData();
        System.out.println(networkConnection);
//
        // we want new object of network connection by clonning
        NetworkConnection networkConnection1 = null;
        try {
            networkConnection1 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
//
//
        // Not Clone Object And Again it will take time
        NetworkConnection networkConnection2 = new NetworkConnection();
        System.out.println("This is not Clone Object 3");
        networkConnection2.setIp("192.168.0.5");
        networkConnection2.loadVeruImportantData();
        System.out.println(networkConnection2);

    }
}
