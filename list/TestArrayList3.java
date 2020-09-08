import java.util.ArrayList;
import java.util.List;

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
public class TestArrayList3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Cat("Cat1"));
        list.add(new Cat("Cat2"));
        list.add(new Cat("Cat3"));

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.print(obj + ",");
        }
    }
}
