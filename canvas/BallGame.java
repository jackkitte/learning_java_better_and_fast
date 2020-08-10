import java.awt.*;
import javax.swing.*;

class Canvas extends JPanel {
  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.fillOval(80, 80, 100, 100);
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