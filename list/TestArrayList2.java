import java.util.ArrayList;
import java.util.List;

public class TestArrayList2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(null);
        list.add(2.5);
        list.add("David");

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.print(obj + ",");
        }

        list.remove(3);
        System.out.println("\nremove(3)---------------");

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.print(obj + ",");
        }
    }
}
