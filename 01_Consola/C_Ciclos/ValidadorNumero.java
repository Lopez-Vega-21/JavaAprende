import java.util.Scanner;

public class ValidadorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        boolean esPrimo = true;
        
        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero - 1; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println("Es un número primo.");
        } else {
            System.out.println("No es un número primo.");
        }
    }
}
