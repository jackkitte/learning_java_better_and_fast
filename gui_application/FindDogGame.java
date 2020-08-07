import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class FindDogGame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Java GUI Application");
    int[][] maps = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 2, 1, 1 }, { 1, 1, 1, 1 } };

    boolean flag = false;
    Random rn = new Random();
    for (int i = 0; i < maps.length; i++) {
      for (int j = 0; j < maps[i].length; j++) {
        if (flag) {
          maps[i][j] = 1;
        } else {
          int nameValue = rn.nextInt(2) + 1;
          maps[i][j] = nameValue;
          if (nameValue == 2) {
            flag = true;
          }
        }
      }
    }

    frame.setLayout(new GridLayout(4, 4));

    for (int i = 0; i < maps.length; i++) {
      for (int j = 0; j < maps[i].length; j++) {
        JButton button = new JButton();
        button.setName(Integer.toString(maps[i][j]));
        frame.add(button);
        button.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (button.getName().equals("1")) {
              button.setText("*");
            } else if (button.getName().equals("2")) {
              button.setText("Dog");
            }
          }
        });
      }
    }

    frame.setSize(250, 250);
    frame.setVisible(true);
  }
}