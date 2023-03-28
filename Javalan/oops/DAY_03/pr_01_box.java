// package oops.DAY_03;

public class pr_01_box {
    double l,h,w;

    pr_01_box()
    {
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    pr_01_box (double side)
    {
        this.h=side;
        this.l=side;
        this.w=side;
    }

    pr_01_box(double l, double w, double h)
    {
        System.out.println("I am box class parent");
        this.l=l;
        this.w=w;
        this.h=h;
    }

    pr_01_box (pr_01_box old)
    {
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;

    }
    public void infromation()
    {
        System.out.println("Running the box");
    }
}
