
public class AssignmentOperator {
  public static void main(String[] args) {
    int d = 4;
    System.out.println(d++);

    d = 4;
    System.out.println(++d);

    d = 4;
    System.out.println(d--);

    d = 4;
    System.out.println(--d);

    int result = 10;
    result = result + 1;
    System.out.println(result);

    result = 10;
    result++;
    System.out.println(result);

    result = 10;
    result += 1;
    System.out.println(result);
  }
}