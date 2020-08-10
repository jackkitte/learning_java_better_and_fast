import java.awt.*;
import javax.swing.*;

class Ball {
  private int x;
  private int y;
  private int r;
  private Color color;

  public Ball(int x, int y, int r, Color color) {
    this.x = x;
    this.y = y;
    this.r = r;
    this.color = color;
  }

  public void draw(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setColor(this.color);
    g2.fillOval(this.x, this.y, 2 * this.r, 2 * this.r);
  }

  public void move(int distance) {
    this.y = this.y + distance;
  }
}

class Canvas extends JPanel {
  protected Ball ball;
  private boolean isRun = true;
  CanvasThread CanvasThread;

  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);

    ball = new Ball(50, 50, 30, Color.BLUE);
    CanvasThread = new CanvasThread();
    CanvasThread.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.clearRect(0, 0, 200, 300);

    ball.draw(g);
  }

  class CanvasThread extends Thread {
    @Override
    public void run() {
      while (isRun) {
        try {
          ball.move(10);
          Thread.sleep(200);
          Canvas.this.repaint();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

public class BallGame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GUI Canvas Application");
    Canvas canvas = new Canvas();
    frame.add(canvas);
    frame.setSize(200, 300);
    frame.setVisible(true);
  }
}