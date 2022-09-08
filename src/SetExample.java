import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void checkEvenNumbers(List<Integer> nums) {
        System.out.println("Task 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("===================================");
    }

    public static void checkWords(List<String> words) {
        System.out.println("Task 3");
        Set<String> set = new TreeSet<>(words);
        System.out.println(set);
        System.out.println("===================================");
    }
}

