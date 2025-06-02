import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Addis Ababa");
        cities.add("Dire Dawa");
        cities.add("Addis Ababa");  // duplicate ignored

        System.out.println("Cities: " + cities);  // [Addis Ababa, Dire Dawa]
    }
}
