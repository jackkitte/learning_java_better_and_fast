import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class IfStatementGUI {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");

    final JLabel scoreLabel = new JLabel("Please input your score:");
    final JTextField scoreTextField = new JTextField();
    final JLabel resultLabel = new JLabel("");

    JButton submitButton = new JButton("Submit");
    submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int score = Integer.parseInt(scoreTextField.getText());

        if (score == 5) {
          resultLabel.setText("Excellent");
        } else if (score == 4) {
          resultLabel.setText("Good");
        } else {
          resultLabel.setText("Need to catch up");
        }
      }
    });

    frame.setLayout(new GridLayout(2, 2));
    frame.add(scoreLabel);
    frame.add(resultLabel);
    frame.add(scoreTextField);
    frame.add(submitButton);

    frame.setSize(500, 100);
    frame.setVisible(true);
  }
}