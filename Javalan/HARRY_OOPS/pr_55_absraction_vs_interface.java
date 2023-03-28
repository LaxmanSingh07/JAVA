
interface Bicycle {
    // you can use the property here also

    int a = 45;

    void applyBrake(int decrement);

    void Speedup(int increment);
}

interface HornCycle
{
    int b=67;
    void BlowHornK3g();
    void blowMaiHun();

}

class AvonCycle implements Bicycle,HornCycle {
    void done() {
        System.out.println("peee poo poo");
    }

    // if have to always use the public in front of the override method of the
    // interface
    // why? ---> in next code
    public void applyBrake(int decrement) {
        System.out.println("Applying brake" + decrement);
    }

    public void Speedup(int increment) {
        System.out.println("Speeding Up" + increment);
    }
    public void BlowHornK3g(){
        System.out.println("Kabhi khushi kabhi gam");
    }
    public void blowMaiHun(){
        System.out.println("pee po po pan");
    }
}

public class pr_55_absraction_vs_interface {
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(6);

        // you can create properties in interfaces
        System.out.println(cycle1.a);

        // you cannot modify the properties in interfaces a they aer final
        // cycle1.a=4556; //eror the find al filed bicycle.a can't be assigned

        cycle1.BlowHornK3g();
        cycle1.blowMaiHun();

    }
}
