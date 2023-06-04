class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " Checking ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, float amount) {
        System.out.print(name + " widthdrawing ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    float amount;

    Customer(String name, ATM atm, float amount) {
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }

    synchronized public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }

}

public class Demo05_ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Smith", atm, 100);
        Customer c2 = new Customer("Joh ", atm, 200);
        c1.start();
        c2.start();
    }
}
