import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//There two events in list box

// 1. ItemEvent (selecting the item from the list box)
// 2. ActionEvent (selecting the item from the list box and then hit the enter key)

// In list we can select multiple items at a time
// In Choice we can select only one item at a time

class MyFrame extends Frame implements ItemListener, ActionListener {
    List l;
    Choice c;
    TextArea ta;

    MyFrame() {
        // rows is used to show the number of items at a time
        // multipleMode is used to select multiple items at a time (true/false)

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
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == l) {
            ta.setText(l.getSelectedItem());

        } else {
            ta.setText(c.getSelectedItem());
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String list[] = l.getSelectedItems();
        String text = "";

        for (String item : list) {
            text = text + item + "\n";
        }
        ta.setText(text);
    }

}

public class PR_06_LIST_BOX_CHOICE {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
