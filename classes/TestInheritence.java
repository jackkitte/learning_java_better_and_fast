class Person {
  protected String name;
  protected int age;

  public Person() {
    System.out.println("Parent Person() instantiation");
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Parent Person(String name, int age) instantiation");
  }

  public void say() {
    System.out.println("Person can speaking : " + name + " , " + age);
  }
}

class Student extends Person {
  public Student() {
    super();
    System.out.println("Subclass Student() Instantiation");
  }

  public Student(String name, int age) {
    super(name, age);
    System.out.println("Subclass Student(String name, int age) " + name + " instantiation");
  }
}

public class TestInheritence {
  public static void main(String[] args) {
    Student s = new Student();
    s.name = "Sumi";
    s.age = 22;
    s.say();

    System.out.println("----------------------------------");

    Student s2 = new Student("Isacc", 23);
    s2.say();
  }
}