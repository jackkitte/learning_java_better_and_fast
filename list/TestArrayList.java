import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(null);
        list.add(2.5);
        list.add("David");

        Object david = list.get(3);
        System.out.println("get(3): " + david);
        System.out.println("size: " + list.size());
        System.out.println("contains david: " + list.contains("David"));
        System.out.println("isEmpty: " + list.isEmpty());

        list.set(3, "Joseph");
        System.out.println("get(3): " + list.get(3));
    }
}
