
package adapter;

public class Demo {
    public static void main(String[] args) {
        
        System.out.println("Program started");
        
       // AppleCharger charger=new AppleChargerXYZ();  // if Apple Charger Available
          
        // If iphone charger is not available then we have 
        // to use Android Charger so we need an adapter means 
        // interface so they work together
        
         AppleCharger charger = new AdapterCharger(new AndroidChargerXYZ());
            
        Iphone iphone=new Iphone(charger);
        iphone.chargeIphone();
    }
}
