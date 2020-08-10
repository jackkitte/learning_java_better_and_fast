import java.awt.*;
import javax.swing.*;

class Canvas extends JPanel {
  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawRect(50, 50, 100, 50);
  }
}

public class ProgressBar {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GUI Canvas Application");
    Canvas canvas = new Canvas();
    frame.add(canvas);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}