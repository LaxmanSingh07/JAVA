import java.awt.*;
class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame()
    {
        super("flowLayout Demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

        FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
        fl.setHgap(100);
        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
   
    }
}
public class PR_08_FLOWLAYOUT {
    public static void main(String[] args) {
        MyFrame mf=new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
