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

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getR() {
    return this.r;
  }
}

class Canvas extends JPanel {
  protected Ball ball;
  private boolean isRun = true;
  private int canvasWidth = 200;
  private int canvasHeight = 300;

  CanvasThread CanvasThread;

  public Canvas() {
    this.setLayout(null);
    this.setBackground(Color.WHITE);

    ball = new Ball(50, 50, 30, Color.BLUE);
    CanvasThread = new CanvasThread();
    CanvasThread.start();
  }

  protected void paintComponent(Graphics g) {
    canvasWidth = this.getWidth();
    canvasHeight = this.getHeight();
    super.paintComponent(g);
    g.clearRect(0, 0, canvasWidth, canvasHeight);

    ball.draw(g);
  }

  class CanvasThread extends Thread {
    @Override
    public void run() {
      String direction = "down";
      while (isRun) {
        try {
          if (ball.getY() + 2 * ball.getR() <= canvasHeight && direction.equals("down")) {
            ball.move(10);
          } else {
            direction = "up";
          }

          if (ball.getY() >= 0 && direction.equals("up")) {
            ball.move(-10);
          } else {
            direction = "down";
          }
          Canvas.this.repaint();
          Thread.sleep(50);
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