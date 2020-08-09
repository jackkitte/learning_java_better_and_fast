class Calculator {
  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b) {
    return a + b;
  }
}

public class TestOverLoad {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    int result = c.add(10, 20);
    System.out.println(result);

    double result2 = c.add(30.5, 40.2);
    System.out.println(result2);
  }
}