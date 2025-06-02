import java.util.*;

public class BoxingDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(10);  // autoboxing: int → Integer
        nums.add(20);
        nums.add(30);

        int sum = 0;
        for (int n : nums) {  // unboxing: Integer → int
            sum += n;
        }

        System.out.println("Sum: " + sum);  // Output: Sum: 60
    }
}
