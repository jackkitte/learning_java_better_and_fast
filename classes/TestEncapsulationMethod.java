class Person {
  private String name;
  private int age;

  public void setName(String name) {
    System.out.println(this);

    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void say() {
    System.out.println("My name is: " + name + ", this year " + age + "years old");
  }
}

public class TestEncapsulationMethod {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Joseph");
    p.setAge(22);
    p.say();

    System.out.println(p);
    System.out.println(p.getName() + " " + p.getAge());
  }
}