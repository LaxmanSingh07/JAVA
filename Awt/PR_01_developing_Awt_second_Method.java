// package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class MyFrame extends Frame { // must extends Frame class to be a frame
    Label lbl;
    TextField tf;
    Button btn;

    public MyFrame() {
        super("My Name"); // frame's constructor will be called
        // This will set the title of the frame
        setLayout(new FlowLayout());
        lbl = new Label("Name");
        tf = new TextField(20);
        btn = new Button("OK");

        add(lbl);
        add(tf);
        add(btn);
    }
}

public class PR_01_developing_Awt_second_Method {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
