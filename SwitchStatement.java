import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Keyboard enters a number 0: up, 1: down, 2: left, 3: right");
    int num = in.nextInt();

    switch (num) {
      case 0:
        System.out.println("Airplane moves up");
        break;
      case 1:
        System.out.println("Airplane moves down");
        break;
      case 2:
        System.out.println("Airplane moves to the left");
        break;
      case 3:
        System.out.println("Airplane moves to the right");
        break;
      default:
        System.out.println("Airplane does not move");
    }
  }
}