import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.multi.MultiInternalFrameUI;

public class GUICalculator {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");

    final JTextField aTextField = new JTextField("");
    final JTextField bTextField = new JTextField("");
    final JLabel equalLabel = new JLabel("=");
    final JLabel resultLabel = new JLabel("0.0");

    JButton addButton = new JButton("+");
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(aTextField.getText());
        int b = Integer.parseInt(bTextField.getText());
        int result = a + b;
        resultLabel.setText(Integer.toString(result));
      }
    });

    JButton subButton = new JButton("-");
    subButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(aTextField.getText());
        int b = Integer.parseInt(bTextField.getText());
        int result = a - b;
        resultLabel.setText(Integer.toString(result));
      }
    });

    JButton multiplyButton = new JButton("*");
    multiplyButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(aTextField.getText());
        int b = Integer.parseInt(bTextField.getText());
        int result = a * b;
        resultLabel.setText(Integer.toString(result));
      }
    });

    JButton divideButton = new JButton("/");
    divideButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(aTextField.getText());
        int b = Integer.parseInt(bTextField.getText());
        int result = a / b;
        resultLabel.setText(Integer.toString(result));
      }
    });

    frame.setLayout(new GridLayout(2, 4));
    frame.add(aTextField);
    frame.add(bTextField);
    frame.add(equalLabel);
    frame.add(resultLabel);

    frame.add(addButton);
    frame.add(subButton);
    frame.add(multiplyButton);
    frame.add(divideButton);

    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}