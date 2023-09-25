
package adapter;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }
    
    
    
    @Override
    public void chargePhone() {
        charger.chargeAndroidPhone(); // Phone is charging with adapeter
        System.out.println("Your Iphone is charging with adapter"); 
    
    }
    
}
