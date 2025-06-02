import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");  // duplicate allowed

        System.out.println("Languages: " + languages);  // [Java, Python, Java]
        System.out.println("First language: " + languages.get(0));  // Java
    }
}
