import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
class MyFrame extends Frame implements KeyListener{
    Label l1,l2,l3,l4;

    MyFrame()
    {
        super("Key Event Demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");

        setLayout(null); //no layout manager

        l1.setBounds(30,10,100,20);
        l2.setBounds(30,40,100,20);
        l3.setBounds(30,70,100,20);
        l4.setBounds(30,100,100,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
        setSize(400, 400);
        setVisible(true);


    }

     public void keyPressed(KeyEvent e) 
    {
        l1.setText("Key Pressed");
        l2.setText("");
    }

    public void keyReleased(KeyEvent e)
    {
        l2.setText("key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    public void keyTyped (KeyEvent e)
    {
        l3.setText("KeyTyped");
        l4.setText(new Date(e.getWhen())+"");
    }


}


public class PR_12_KeyEvent {
    // keypressed event : when a key is pressed
    // keyTyped event : when a key is pressed and holded for some time
    // keyReleased event : when a key is released

    //virtual key is present for the keys 
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
    }
}
