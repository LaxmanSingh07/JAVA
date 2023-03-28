// package oops;

// import javax.print.FlavorException;

public class pr_05_with_04 {

    public static void main(String[] args) {

        Human kunal = new Human(18, "kuna", 784, false);
        System.out.println(kunal.age);
        Human Laxman = new Human(15, "laxman Singh", 46232.456f, true);

        // according to the convesion we have to use the class name

        // static variable are can be accessed on the class name

        System.out.println(Human.population); // variable it is common to the class not to the object
        // greeting(); //error --->non-static method greeting() cannot be referenced from a static context

        //we know the something which is not static,belongs to an object 
        //and non-static can't be refernce fomr a static context 

        // fun();  

        Main funn=new Main();
        funn.fun2();
    }

    // //this is not depentent on objects 
    static void fun()
    {
        // greeting(); // you can't use this because it requires an instance 
        //but the function you are using it is does not depend on instances 

    //     // you can't access non static stuff without refer

        Main obj=new Main();
        obj.greeting();
    }

    // //  but a non-static can have static inside it 

    // static void greeting() {
    //     System.out.println("Hello World");




    // }

    void fun2(){
        greeting();
    }
    void greeting()
    {
        System.out.println("Hello Mere bhai");
    }
}
