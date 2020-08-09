import java.util.Scanner;

public class TestStringSplit {
  public static void main(String[] args) {
    String scores = "100;98;95";

    String[] scoreArray = scores.split(";");

    System.out.println("language=" + scoreArray[0] + " mathematics=" + scoreArray[1] + " physics=" + scoreArray[2]);
  }
}