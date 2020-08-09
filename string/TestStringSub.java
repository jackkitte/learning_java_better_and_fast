import java.util.Scanner;

public class TestStringSub {
  public static void main(String[] args) {
    String filePath = "c:/images/baby.jpeg";
    String fileExtention = filePath.substring(filePath.indexOf("."));
    System.out.println(fileExtention);

    String checks = ".png .gif .jpg";
    fileExtention = fileExtention.toLowerCase();

    if (!checks.contains(fileExtention)) {
      System.out.println("You are not entering an image file");
    }

    String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
    System.out.println(fileName);
  }
}