import java.awt.*;

public class PR_20_ReactangleRobot {

    public static void main(String[] args) {
        Frame frame = new Frame("Rectangle Robot");
        frame.setSize(400, 400);

        frame.add(new Canvas() {
            @Override
            public void paint(Graphics g) {
                // Draw head
                g.setColor(Color.YELLOW);
                g.fillRect(100, 100, 200, 200);

                // Draw neck
                g.setColor(Color.GRAY);
                g.fillRect(195, 300, 10, 50);

                // Draw ears
                g.setColor(Color.YELLOW);
                g.fillOval(85, 150, 30, 60);
                g.fillOval(285, 150, 30, 60);

                // Draw eyes
                g.setColor(Color.BLACK);
                g.fillOval(140, 180, 40, 40);
                g.fillOval(220, 180, 40, 40);
            }
        });

        frame.setVisible(true);
    }
}