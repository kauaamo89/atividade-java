import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Questão 1 - Média =====");
        Media.calcularMedia(scanner);

        System.out.println("\n===== Questão 2 - Múltiplos =====");
        System.out.println("Insira o número que deseja: ");
        int numeroMultiplo = scanner.nextInt();
        Multiplo.mostrar(numeroMultiplo);

        System.out.println("\n===== Questão 3 - Números primos =====");
        System.out.println("Insira o valor de N: ");
        int n = scanner.nextInt();
        Primo.verificarPrimo(n);

        System.out.println("\n===== Questão 4 - Asteriscos =====");
        Asteriscos.mostrarAsteriscos(scanner);
    }
}
