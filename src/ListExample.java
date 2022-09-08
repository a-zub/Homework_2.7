import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void checkOddNumbers(List<Integer> nums) {
        System.out.println("Task 1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("===================================");
    }
}
