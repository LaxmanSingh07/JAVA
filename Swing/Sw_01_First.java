// package Swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    MyFrame() {
        super("Swing Demo");
        setLayout(new FlowLayout());
        l = new JLabel("Clicked " + count + " times");
        b = new JButton("Click Me");

        add(l);
        add(b);
        // add(new JButton("Cancel"));

        b.addActionListener(this);
        getRootPane().setDefaultButton(b); // when I hit enter then that button will be clicked


        // b.setIcon(new ImageIcon("icon.png"));
        l.setToolTipText("Counter"); // It is used to show the message when we hover over the label
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " times");
    }
}

public class Sw_01_First {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        // It is used to close the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
