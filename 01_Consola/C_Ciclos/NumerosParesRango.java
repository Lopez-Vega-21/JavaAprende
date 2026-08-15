public class NumerosParesRango {
    public static void main(String[] args) {
        System.out.println("Números pares del 2 al 15:");
        for (int i = 2; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
