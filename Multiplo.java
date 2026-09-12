public class Multiplo {
    static final int multiplo3 = 3;
    static final int multiplo5 = 5;

    public static void mostrar(int numero) {
        if (numero % multiplo3 == 0) {
            if (numero % multiplo5 == 0) {
                System.out.println("Múltiplo de ambos");
            } else {
                System.out.println("Múltiplo de 3");
            }
        } else if (numero % multiplo5 == 0) {
            System.out.println("Múltiplo de 5");
        } else {
            System.out.println("Não é múltiplo de 3 nem de 5");
        }
    }
}
