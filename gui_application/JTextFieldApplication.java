import java.awt.BorderLayout;
import javax.swing.*;

public class JTextFieldApplication {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");
    JTextField textField = new JTextField();
    frame.add(textField, BorderLayout.NORTH);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}