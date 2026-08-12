import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar dos números
        System.out.print("Ingresa el primer número: ");
        double num1 = teclado.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = teclado.nextDouble();
        
        // 2. Calcular y mostrar suma, resta, multiplicación
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        // 3. Calcular y mostrar división (Validar que el divisor no sea 0)
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir entre cero.");
        }
        
        teclado.close();
    }
}