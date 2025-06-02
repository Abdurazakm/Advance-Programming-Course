import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 4, 1, 3));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;  // ascending order
            }
        };

        list.sort(comparator);
        System.out.println(list); // Output: [1, 2, 3, 4, 5]
    }
}
