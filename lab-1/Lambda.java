import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);

        // Sort using lambda
        numbers.sort((a, b) -> a - b);

        System.out.println(numbers);  // [1, 2, 3, 5, 9]
    }
}
