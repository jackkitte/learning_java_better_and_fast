abstract class Father {
  protected String fruit;

  public String getFruit() {
    return this.fruit;
  }

  public abstract void buy(String fruit);
}

class Son extends Father {
  private String name;

  public Son(String name) {
    super();
    this.name = name;
  }

  public void buy(String fruit) {
    this.fruit = fruit;
  }

  public String getName() {
    return this.name;
  }
}

public class TestAbstract {
  public static void main(String[] args) {
    Son s = new Son("Luke");
    s.buy("Fruit");

    System.out.println("Dad, Dad, I bought a pound: " + s.getFruit());
  }
}