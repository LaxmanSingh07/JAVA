
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    int x = 0, y = 0;

    MyFrame() {
        super("Painting");
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me) {
                x = me.getX();
                y = me.getY();

                // we have to call repaint

                repaint();
            }
        });

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        // g.drawOval(x, y, 50, 50);
        // g.fillOval(x, y, 50, 50);

        g.setFont(new Font("Times New Roman",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
}

public class PR_17_Painting {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
