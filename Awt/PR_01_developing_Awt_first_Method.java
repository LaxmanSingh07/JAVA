// package Awt;
import java.awt.*;
public class PR_01_developing_Awt_first_Method {
    public static void main(String []args)
    {
        //Frame Class

        Frame f=new Frame("My First App");
        f.setLayout(new FlowLayout());
        f.setSize(300, 300); // it is very essential 
        Button btn=new Button("OK");
        Label lbl1=new Label("Name");
        TextField tf=new TextField(20);
        f.add(lbl1);
        f.add(tf);
        f.add(btn);
        f.setVisible(true);
    }
}
