import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button btn;

    MyFrame()
    {
        super("TextArea Demo");
        l=new Label("No Text Enterd           ");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        btn=new Button("Click");

        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    //    l.setText(ta.getSelectedText());

    // ta.append(" "+tf.getText());
    
    ta.insert(tf.getText(), ta.getCaretPosition()); // to insert a text where the hello is appreaing

    }
}
public class PR_05_TEXTArea_Operations {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
