// package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {
    JCheckBox c1, c2;

    JRadioButton r1, r2;

    JTextField tf;

    MyFrame()
    {
        super("Demo");

        tf=new JTextField("Demo Text",20);
        tf.setBounds(10, 10, 100, 20); 
        c1=new JCheckBox("Bold");

        c1.setMnemonic(HEIGHT);
        
    }
}

public class Sw_03_JCheckBox_and_JRadioButton {
    public static void main(String[] args) {

    }
}
