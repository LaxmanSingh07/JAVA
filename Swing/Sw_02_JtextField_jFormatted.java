// package Swing;

import java.awt.*;
import java.text.*;
import java.util.Locale;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame {
    MyFrame() {
        JTextField tf1 = new JTextField(10);
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        // DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);
        tf2.setColumns(10);
        tf2.setValue(new java.util.Date());

        // NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        JFormattedTextField tf3 = new JFormattedTextField(nft);

        tf3.setColumns(10);
        tf3.setValue(1000);

        JTextArea ta = new JTextArea(5, 20);
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);

    }
}

public class Sw_02_JtextField_jFormatted {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
