class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }
}

public class ArithmeticOperator {

  public static void main(String[] args) {

    Calculator cal = new Calculator();

    int result = cal.add(4, 2);
    System.out.println(result);

    result = cal.sub(4, 2);
    System.out.println(result);

    result = cal.multiply(4, 2);
    System.out.println(result);

    result = cal.divide(4, 2);
    System.out.println(result);
  }
}