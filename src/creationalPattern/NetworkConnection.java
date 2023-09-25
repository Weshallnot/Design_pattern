
package creationalPattern;

public class NetworkConnection implements  Cloneable {   //marker Interface
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" + "ip=" + ip + ", importantData=" + importantData + '}';
    }
    
    public void loadVeruImportantData() throws InterruptedException  // this method will take a time at time of object creation
            {
                this.importantData="very very important data";
                Thread.sleep(5000);
            }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}       
