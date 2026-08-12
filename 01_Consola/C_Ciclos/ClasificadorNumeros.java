public class ClasificadorNumeros {
    public static void main(String[] args) {
        System.out.println("--- NÚMEROS PARES (1-100) ---");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        
        System.out.println("--- NÚMEROS IMPARES (1-100) ---");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        
        System.out.println("--- NÚMEROS PRIMOS (1-100) ---");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
