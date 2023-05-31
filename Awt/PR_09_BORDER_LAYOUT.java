import java.awt.*;

class MyFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame() {
        super("flowLayout Demo");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        // this is not the way to use the border layout
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        // add(b3,BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Web"));

        add(p, BorderLayout.EAST);

    }
}

public class PR_09_BORDER_LAYOUT {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
