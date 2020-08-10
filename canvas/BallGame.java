import java.awt.*;
import javax.swing.*;

class Ball {
  public void draw(Graphics g, int x, int y, int r, Color c) {
    g.setColor(c);
    g.fillOval(x, y, 2 * r, 2 * r);
  }
}

class Canvas extends JPanel {
  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Ball ball = new Ball();
    ball.draw(g, 50, 50, 30, Color.RED);
    ball.draw(g, 120, 50, 30, Color.GREEN);
    ball.draw(g, 190, 50, 30, Color.BLUE);
  }
}

public class BallGame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GUI Canvas Application");
    Canvas canvas = new Canvas();
    frame.add(canvas);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}