import java.util.Scanner;

public class Media {
    public static void calcularMedia(Scanner scanner) {
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota 3 (peso 2): ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + (nota3 * 2)) / 4;

        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
