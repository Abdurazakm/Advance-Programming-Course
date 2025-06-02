import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentGrades = new HashMap<>();

        // Correctly add students and a list of grades
        studentGrades.put("Abdurazak", Arrays.asList(90, 85, 95));
        studentGrades.put("Abebe", Arrays.asList(80, 75, 70));
        studentGrades.put("Kebede", Arrays.asList(88, 92, 86));

        // Loop through each student
        for (String name : studentGrades.keySet()) {
            List<Integer> grades = studentGrades.get(name);

            // Calculate average
            double sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double avg = sum / grades.size();

            // Print result
            System.out.printf("%s's average grade: %.2f%n", name, avg);
        }
    }
}
