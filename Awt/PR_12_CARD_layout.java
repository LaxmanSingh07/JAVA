import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends Frame implements ItemListener {
    Button b1, b2, b3;
    TextField t1, t2, t3;
    Panel p1;
    Panel p2;
    Panel cp;
    Panel mainp;
    Checkbox c1, c2;

    public MyFrame() {
        super("CardLayout Demo");

        CheckboxGroup cg = new CheckboxGroup();
        c1 = new Checkbox("One", false, cg);
        c2 = new Checkbox("Two", true, cg);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp = new Panel();
        mainp.setLayout(new CardLayout());
        mainp.add("One", p1);
        mainp.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mainp, BorderLayout.CENTER);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (c1.getState()) {
            ((CardLayout) mainp.getLayout()).show(mainp, "One");
        } else {
            ((CardLayout) mainp.getLayout()).show(mainp, "Two");
        }
    }
}

public class PR_12_CARD_layout {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
