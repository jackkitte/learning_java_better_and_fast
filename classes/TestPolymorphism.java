class Person {
  public void say() {
    System.out.println("Person speaking");
  }
}

class Student extends Person {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void say() {
    System.out.println("Student speak english");
  }

  public void study() {
    System.out.println("study");
  }
}

public class TestPolymorphism {
  public static void main(String[] args) {
    Person p = new Student("David");
    p.say();

    Student s = (Student) p;
    s.say();
    s.study();
  }
}