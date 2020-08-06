import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class JButtonEventApplication {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");
    final JLabel label = new JLabel();
    JButton button = new JButton("Click Button");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("The Button Clicked");
      }
    });

    frame.add(label, BorderLayout.NORTH);
    frame.add(button, BorderLayout.SOUTH);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}