class Person {
  public void say() {
    System.out.println("Person speaking");
  }
}

class ChineseStudent extends Person {
  public void say() {
    System.out.println("Speak Chinese");
  }
}

class AmericaStudent extends Person {
  public void say() {
    System.out.println("Speak English");
  }
}

public class TestOverride {
  public static void main(String[] args) {
    ChineseStudent s = new ChineseStudent();
    s.say();

    AmericaStudent as = new AmericaStudent();
    as.say();
  }
}