package task.divizibil;

public class Divizibilitatea {
    public static void main(String[] args) {
        int count = 0;

        // Parcurgem numerele de la 100 la 1000
        for (int i = 100; i <= 1000; i++) {
            // Verificăm dacă numărul este divizibil atât cu 5, cât și cu 6
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count++;

                // După fiecare 10 numere afișate, trecem la o linie nouă
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
