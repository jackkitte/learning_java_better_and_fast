class Mother {
  private String name;
  private String food;

  public Mother(String name) {
    this.name = name;
  }

  public void eat(String food) {
    this.food = food;
    System.out.println(this.name + " eat " + this.food);
  }

  class Baby {
    public void eat() {
      System.out.println("Baby absorb nutrients from the mother's " + food);
    }
  }
}

public class TestInnerClass {
  public static void main(String[] args) {
    Mother mother = new Mother("Lucy");
    mother.eat("Apple");

    Mother.Baby baby = mother.new Baby();
    baby.eat();
  }
}