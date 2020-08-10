import java.awt.*;
import javax.swing.*;

class Canvas extends JPanel {
  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillRect(50, 50, 100, 50);

    g.setColor(Color.GREEN);
    g.fillRect(160, 50, 100, 50);

    g.setColor(Color.BLUE);
    g.fillRect(270, 50, 100, 50);

  }
}

public class ProgressBar {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GUI Canvas Application");
    Canvas canvas = new Canvas();
    frame.add(canvas);
    frame.setSize(450, 200);
    frame.setVisible(true);
  }
}