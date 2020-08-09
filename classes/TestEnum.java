enum Color {
  RED, GREEN, BULE
}

class Circle {
  double r;
  final double PI = 3.14;
  Color color;

  public Circle(double r, Color color) {
    this.r = r;
    this.color = color;
  }

  public double getArea() {
    return PI * r * r;
  }

  public void draw() {
    String colorName = "";
    if (color == Color.RED) {
      colorName = "Red";
    } else if (color == Color.GREEN) {
      colorName = "Green";
    } else if (color == Color.BULE) {
      colorName = "Blue";
    }
    System.out.println("draw circle area: " + getArea() + " color: " + colorName);
  }
}

public class TestEnum {
  public static void main(String[] args) {
    Circle red = new Circle(5, Color.RED);
    red.draw();

    Circle green = new Circle(10, Color.GREEN);
    green.draw();

    Circle blue = new Circle(20, Color.BULE);
    blue.draw();
  }
}