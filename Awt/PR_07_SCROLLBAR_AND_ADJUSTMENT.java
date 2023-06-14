// the adjustmentListener

//unit incr, decrem
//block in cr, 
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener{
    Scrollbar red, green, blue;
    TextField tf;

    MyFrame() {

        // Constructor of Scrollbar class :

        // Scrollbar(int orientation) : creates a vertical scrollbar if orientation is Scrollbar.VERTICAL and horizontal scrollbar if orientation is Scrollbar.HORIZONTAL.
        // Scrollbar(int orientation, int value, int visible, int minimum, int maximum) : creates a vertical scrollbar if orientation is Scrollbar.VERTICAL and horizontal scrollbar if orientation is Scrollbar.HORIZONTAL. The initial value of the scrollbar is value, the amount of the scrollbar's range represented by the knob is visible, and the scrollbar's range is defined by minimum and maximum.

        super("Color Scrollbar");
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf = new TextField(20);

        //setBounds(x, y, width, height)
        // It is used to set the position and size of the component.

        tf.setBounds(50, 50, 300, 100);
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);

        setLayout(null); // we have to set the layout to null because we are using setBounds() method

        add(tf);
        add(red);
        add(green);
        add(blue);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(),blue.getValue()));
    }
}

public class PR_07_SCROLLBAR_AND_ADJUSTMENT {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
