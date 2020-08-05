public class TypeConversions {

  public static void main(String[] args) {

    String a = "1";
    String b = "2";

    String result = a + b;
    System.out.println(result);

    int total = Integer.parseInt(a) + Integer.parseInt(b);
    System.out.println(total);
  }
}