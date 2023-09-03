import java.util.Scanner;
public class Histograma {
    public static void main(String[] args) {
        try (// Create a scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in)) {
            // Initialize the positive and negative counters to 0.
            int positiveCount = 0;
            int negativeCount = 0;
            // Continuously prompt the user for an integer value.
            while (true) {
                // Prompt the user for an integer value.
                System.out.print("Enter an integer value (0 to terminate): ");
                int value = scanner.nextInt();
                // If the user enters 0, stop prompting for integer values.
                if (value == 0) {
                    break;
                }
                // Increment the positive or negative counter depending on the value entered by the user.
                if (value > 0) {
                    positiveCount++;
                } else if (value < 0) {
                    negativeCount++;
                }
            }
            // Print the number of positive and negative values entered by the user.
            System.out.println("Positives: " + "*".repeat(positiveCount));
            System.out.println("Negatives: " + "*".repeat(negativeCount));
        }
    }
}