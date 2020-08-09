class Baby {
  private Fruit fruit;
  private String name;

  public Baby(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Fruit getFruit() {
    return this.fruit;
  }

  public void eat(Fruit fruit) {
    this.fruit = fruit;
  }
}

class Fruit {
  private String name;

  public Fruit(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

class Apple extends Fruit {
  public Apple(String name) {
    super(name);
  }
}

class Grape extends Fruit {
  public Grape(String name) {
    super(name);
  }
}

public class TestPolymorphism2 {
  public static void main(String[] args) {
    Baby baby = new Baby("Gajia");

    Apple apple = new Apple("Red apple");
    Grape grape = new Grape("Black grape");

    baby.eat(apple);
    System.out.println(baby.getName() + " eat " + baby.getFruit().getName());

    baby.eat(grape);
    System.out.println(baby.getName() + " eat " + baby.getFruit().getName());
  }
}