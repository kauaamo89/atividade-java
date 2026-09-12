public class Primo {
    public static void verificarPrimo(int numero) {
        for (int i = 2; i <= numero; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
    }
}
