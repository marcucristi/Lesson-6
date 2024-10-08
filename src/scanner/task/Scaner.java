package scanner.task;
import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int totalSum = 0;
        int number;

        // Citirea numerelor până la introducerea lui 0
        do {
            System.out.print("Introduceți un număr (0 pentru a opri): ");
            number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            totalSum += number;
        } while (number != 0);

        // Afișarea rezultatelor
        System.out.println("Numărul de valori pozitive: " + positiveCount);
        System.out.println("Numărul de valori negative: " + negativeCount);
        System.out.println("Suma totală: " + totalSum);
    }
}
