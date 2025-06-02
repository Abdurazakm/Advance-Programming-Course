import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Java");
        deque.addLast("Python");
        deque.addLast("C++");

        System.out.println("First: " + deque.getFirst()); // Java
        System.out.println("Last: " + deque.getLast());   // C++

        System.out.println("Popped: " + deque.pop()); // Java
        System.out.println("Remaining: " + deque);     // [Python, C++]
    }
}
