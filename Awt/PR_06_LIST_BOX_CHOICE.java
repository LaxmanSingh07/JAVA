import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

class MyFrame extends Frame {
    List l;
    Choice c;
    TextArea ta;

    MyFrame() {
        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20, 30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Januaray");
        c.add("February");
        c.add("March");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

    }

}

public class PR_06_LIST_BOX_CHOICE {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
