// package oops.DAY_03;

public class Main2 {
    public static void main(String[] args) {
        // pr_01_box Box=new pr_01_box(4.0,5.4,9.9);
        // pr_01_box Box2=new pr_01_box(Box);
        // System.out.println(Box.l+" "+Box.w+" "+Box.h);
        // System.out.println(Box2.l+" "+Box2.w+" "+Box2.h);

        // BoxWeight Box3=new BoxWeight();
        // BoxWeight Box4=new BoxWeight(2,3,4,5);
        // System.out.println(Box3.l+" "+Box3.w+" "+Box3.h);
        // System.out.println(Box4.l+" "+Box4.w+" "+Box4.h+" "+Box4.weight);

        // pr_01_box Box5=new BoxWeight(2,3,4,5);
        // System.out.println(Box5);

        // there are many varibale in both parent and child clases
        // you are given accesss to varaibles that are
        // in the ref types i.e. BoxWeight
        // hence, you shouldhave acces to weight variable

        // this also means that the one you are trying to access should be initailzed
        // but here,when the obj itself is of type parent class, how will you call the
        // constructor of base class

        // down
        // BoxWeight Box6 =new pr_01_box Box6(2,3,4,5);
        // System.out.println(Box6.w);

        // multilevel

        boxPrice box = new boxPrice(45.5, 4.5, 11.11);
        System.out.println(box.l + " " + box.w + " " + box.weight + " " + box.cost);

    }
}
