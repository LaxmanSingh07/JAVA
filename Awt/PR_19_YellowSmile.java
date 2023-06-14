import java.awt.*;

public class PR_19_YellowSmile {

    public static void main(String[] args) {
        Frame frame = new Frame("Yellow Smile");
        frame.setSize(400, 400);

        frame.add(new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.YELLOW);
                g.fillOval(100, 100, 200, 200);

                g.setColor(Color.BLACK);
                g.fillOval(150, 170, 20, 40);
                g.fillOval(230, 170, 20, 40);

                g.drawArc(150, 200, 100, 70, 180, 180);
            }
        });

        frame.setVisible(true);
    }

}
