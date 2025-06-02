import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> nums = new TreeSet<>(Arrays.asList(10, 20, 30, 40));

        System.out.println("Lower than 25: " + nums.lower(25));  // 20
        System.out.println("Ceiling of 25: " + nums.ceiling(25)); // 30
        System.out.println("Floor of 25: " + nums.floor(25)); // 20
        System.out.println("Descending Set: " + nums.descendingSet()); // [40, 30, 20, 10]
    }
}
