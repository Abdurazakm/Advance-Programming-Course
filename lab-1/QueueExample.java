import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Ali");
        queue.offer("Zara");
        queue.offer("Musa");

        System.out.println("Head: " + queue.peek()); // Ali

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
    }
}
