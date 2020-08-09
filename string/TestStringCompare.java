public class TestStringCompare {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";
    String str3 = "Hello";
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str1.equalsIgnoreCase(str3));

    String str = "Children's songs";
    System.out.println(str.startsWith("Children"));

    String fileName = "c:/media/amazing.mp3";
    System.out.println(fileName.endsWith(".mp3"));
  }
}