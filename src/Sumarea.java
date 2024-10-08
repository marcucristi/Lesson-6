public class Sumarea {
    public static void main(String[] args) {
        double sum = 0.0;

        // Parcurgem termenii seriei de la 1/3 până la 97/99
        for (int numerator = 1, denominator = 3; numerator <= 97; numerator += 2, denominator += 2) {
            sum += (double) numerator / denominator;
        }

        // Afișăm suma
        System.out.println("Suma seriei este: " + sum);
    }
}