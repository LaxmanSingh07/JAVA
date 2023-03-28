interface Camera {
    void takeSnap();

    void recordVideo();

    // i can override the default method
    //if you don't want to force 
    default void recordVideo4k() {
        System.out.println("I will run if you will not ");
    }

    //classes wich implements this class can't get this class
    private void greet()
    {
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

}

public class pr_57_default_memthods {
    public static void main(String[] args) {
        SmartPhone my = new SmartPhone();
        String[] ar = my.getNetworks();
        for (String iteam : ar) {
            System.out.println(iteam);
        }
        my.recordVideo4k();
        // my.greet(); // you can't directly access the privae member of the class 
        //it will throws an error 
        
    }
}
