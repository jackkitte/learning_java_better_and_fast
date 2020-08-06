import javax.swing.*;

public class JLabelApplication {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");
    JLabel label = new JLabel("I loving Java Application");
    frame.add(label);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}