import java.awt.BorderLayout;
import javax.swing.*;

public class JButtonApplication {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");
    JButton button = new JButton("Click Button");
    frame.add(button, BorderLayout.SOUTH);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}