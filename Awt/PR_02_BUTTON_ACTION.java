// package Awt;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    int count = 0;
    Label lbl1;
    Button btn1;

    public MyFrame() {
        super("Button Demo");
        lbl1 = new Label(" " + count);
        btn1 = new Button("Click");

        btn1.addActionListener(this);// this class ActionListner
        setLayout(new FlowLayout());

        add(lbl1);
        add(btn1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        lbl1.setText(" " + count);
    }

}

public class PR_02_BUTTON_ACTION {
    public static void main(String args[]) {
        MyFrame f=new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
