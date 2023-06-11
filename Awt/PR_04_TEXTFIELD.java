import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    Label l1, l2;
    TextField tf;

    MyFrame() {
        super("Text Field Demo");
        l1 = new Label("No Text is Entered Yet");
        l2 = new Label("Enter key is not ye hit");
        tf = new TextField(20);
        // tf.setText(getName());
        // tf.getText()

        Handler h = new Handler();
        tf.setEchoChar('*');
        tf.addTextListener(h);
        tf.addActionListener(h);
        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(l2);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }
    
    class Handler implements TextListener, ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            l1.setText(tf.getText());
        }

        @Override
        public void textValueChanged(TextEvent e) {
            l2.setText(tf.getText());
        }

    }
}

public class PR_04_TEXTFIELD {
    public static void main(String args[]) {
        MyFrame f1 = new MyFrame();
        f1.setSize(330, 330);
        f1.setVisible(true);
    }
}
