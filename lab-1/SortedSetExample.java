import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Sorted Set: " + numbers);  // [1, 3, 5]
    }
}
