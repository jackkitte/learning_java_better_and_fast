import java.awt.*;
import javax.swing.*;

public class GridLayoutApplication {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");

    JButton button0_0 = new JButton("0, 0");
    JButton button0_1 = new JButton("0, 1");
    JButton button0_2 = new JButton("0, 2");

    JButton button1_0 = new JButton("1, 0");
    JButton button1_1 = new JButton("1, 1");
    JButton button1_2 = new JButton("1, 2");

    frame.setLayout(new GridLayout(2, 3));
    frame.add(button0_0);
    frame.add(button0_1);
    frame.add(button0_2);

    frame.add(button1_0);
    frame.add(button1_1);
    frame.add(button1_2);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}