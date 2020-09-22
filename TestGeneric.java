import java.util.*;

class Person<T> {
    private T age;

    public Person(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}

public class TestGeneric {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>("30");
        System.out.println(p1.getAge());

        Person<Integer> p2 = new Person<Integer>(80);
        System.out.println(p2.getAge());
    }
}
