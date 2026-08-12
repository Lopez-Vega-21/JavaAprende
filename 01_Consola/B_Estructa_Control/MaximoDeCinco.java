import java.util.Scanner;

public class MaximoDeCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa 5 números enteros:\nNúmero 1: ");
        int mayor = teclado.nextInt();
        
        for (int i = 2; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int actual = teclado.nextInt();
            if (actual > mayor) {
                mayor = actual;
            }
        }
        
        System.out.println("El número mayor de todos es: " + mayor);
    }
}