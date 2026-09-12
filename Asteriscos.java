import java.util.Scanner;

public class Asteriscos {
    public static void mostrarAsteriscos(Scanner scanner) {
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + " (1 a 30): ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
