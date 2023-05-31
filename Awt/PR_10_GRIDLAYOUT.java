import java.awt.*;

class MyFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame() {
        super("GridLayout Demo");

        setLayout(new GridLayout(3,2));
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

      

    }
}

public class PR_10_GRIDLAYOUT {
    

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
