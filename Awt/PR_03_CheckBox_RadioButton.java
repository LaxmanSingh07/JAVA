
// package Awt;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener {
    Label lbl1;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;

    public MyFrame() {
        super("Check Box Demo");
        lbl1 = new Label("Nothing");

        cbg=new CheckboxGroup();



        // This is for the checkbox 

        // c1 = new Checkbox("Java");
        // c2 = new Checkbox("Python");
        // c3 = new Checkbox("C#");

       
        // This is for the checkbox group
       
        //false/true (second param) -> it is used to set the state of the checkbox
        // is used to wheather the checkbox is intial selected 
        c1 = new Checkbox("Java" ,false,cbg);
        c2 = new Checkbox("Python" ,false,cbg);
        c3 = new Checkbox("C#" ,false,cbg);



        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(lbl1);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // e.getItem();// it will give the reference of the button which is clicked

        String str = "";
        if (c1.getState()) //getState() is used to check wheather the checkbox is selected or not
            str = str + " " + c1.getLabel();
        if (c2.getState())
            str = str + " " + c2.getLabel();
        if (c3.getState())
            str = str + " " + c3.getLabel();

        if(str.isEmpty()){
            str="Nothing is selected";
        }
        lbl1.setText(str);
    }
}

public class PR_03_CheckBox_RadioButton {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);

    }
}
