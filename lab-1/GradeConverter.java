import java.util.*;

public class GradeConverter {
    public static void main(String[] args) {
        List<String> inputScores = Arrays.asList("85", "92", "78", "invalid", "100");

        List<Integer> validScores = new ArrayList<>();

        for (String score : inputScores) {
            try {
                // TODO: Convert and add to validScores
                validScores.add(Integer.parseInt(score));

            } catch (NumberFormatException e) {
                System.out.println("Invalid input skipped: " + score);
            }
        }

        // TODO: Calculate average
        if (!validScores.isEmpty()) {
            int sum = 0;
            for (int score : validScores) {
                sum += score;
            }
            double avg = sum / (double) validScores.size();
            System.out.printf("Average of valid scores: %.2f%n", avg);
        } else {
            System.out.println("No valid scores to average.");
        }
    }
}
