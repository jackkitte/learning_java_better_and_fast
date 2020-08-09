class Person {
  private String name;
  private int age;

  public Person() {
    System.out.println("Person is instantiated");
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void say() {
    System.out.println("My name is : " + name + ", this year : " + age + "years old");
  }
}

public class TestConstructor {
  public static void main(String[] args) {
    Person p = new Person();
    Person p2 = new Person("Joseph", 22);

    p2.say();
    new Person("David", 23).say();
  }
}