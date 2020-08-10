import java.awt.*;
import javax.swing.*;

class Canvas extends JPanel {
  int width = 0;

  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);
    new ProgressBarThread().start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawRect(50, 50, 150, 50);

    g.setColor(Color.RED);
    g.fillRect(50, 50, width, 50);
  }

  class ProgressBarThread extends Thread {
    @Override
    public void run() {
      while (width < 150) {
        width = width + 10;
        try {
          Thread.sleep(200);
          Canvas.this.repaint();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
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