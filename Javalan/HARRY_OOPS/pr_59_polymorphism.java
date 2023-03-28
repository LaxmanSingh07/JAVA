
interface Camera {
    void takeSnap();

    void recordVideo();

    // i can override the default method
    // if you don't want to force
    default void recordVideo4k() {
        System.out.println("I will run if you will not ");
    }

    // classes wich implements this class can't get this class
    private void greet() {
        System.out.println("Good morning");
    }
}

interface wifi {
    String[] getNetworks();

    void connectToNetwork(String network);

}

class CellPhone {

    void callNumber(int phoneno) {
        System.out.println("calling" + phoneno);
    }

    void pickCall(int phoneno) {
        System.out.println("Connectring" + phoneno);
    }

}

class SmartPhone extends CellPhone implements wifi, Camera {

    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    public void connectToNetwork(String name) {
        System.out.println("connecting to the network" + name);

    }

    public String[] getNetworks() {
        System.out.println("Gettingg list of networks");
        String[] NetworkList = { "Harry", "Isha", "Rahul" };
        return NetworkList;
    }

    public void recordVideo4k() {
        System.out.println("I will definatly run");
    }

    public void sampleMeth() {
        System.out.println("meth");
    }
}

public class pr_59_polymorphism {
    public static void main(String[] args) {

        Camera cam1 = new SmartPhone();// this is a smartphone but use it as a camera
        // cam1.getNetworks();------> NOT ALLOWED
        // cam1.sampleMeth();//not allowed
        cam1.recordVideo4k();

        SmartPhone s = new SmartPhone();
        s.callNumber(8);
        s.sampleMeth();
        s.takeSnap();
        s.recordVideo();
        s.recordVideo4k();
    }
}
