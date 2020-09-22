import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "David");
        map.put("age", 20);
        map.put("salary", 12000);
        map.put("married", false);

        Iterator<Map.Entry<String, Object>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Object> entry = iter.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
