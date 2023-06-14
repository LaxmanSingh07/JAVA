
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener,MouseMotionListener
{
    Label l;
    
    MyFrame()
    {
        super("Mouse Event Demo");
        l=new Label("");
        setLayout(null);
        l.setBounds(10, 50, 100, 20);
        add(l);

        setVisible(true);
        setSize(350, 350);

        addMouseMotionListener(this);
        addMouseListener(this);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved");
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Move");
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exit");
    }
}

public class PR_13_MouseEvent {

    //There are some eventOfTheMouse 
    // - mouseEntered
    // - mouseExited
    // - left button mouseClicked it involves two more events 
        // (Pressed and Released)
    // If mouse is moving without clicking then moved

    // If clicked then move (mouseDragged)

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
    }
}
