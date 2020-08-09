class Person {
  String name;
  int age;

  public void say() {
    System.out.println("My name is: " + name + ", this year: " + age + "years old");
  }
}

public class TestClass {
  public static void main(String[] args) {
    Person p = new Person();

    p.name = "Joseph";
    p.age = 22;
    p.say();

    Person p2 = new Person();

    p2.name = "David";
    p2.age = 23;
    p2.say();
  }
}