public class TestException {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.div(10, 0);
    System.out.println("div finished execution");
  }
}

class Calculator {
  public int div(int a, int b) {
    int result = 0;

    try {
      result = a / b;
      System.out.println("Normal execution");

      return result;
    } catch (Exception e) {
      System.out.println("Divisor cannot be 0");
    } finally {
      System.out.println("finally the last free release");
    }

    System.out.println("Result return");

    return 0;
  }
}