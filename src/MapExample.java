import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void checkDoubleWords(List<String> words) {
        System.out.println("Task 4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
        System.out.println("===================================");
    }
}
