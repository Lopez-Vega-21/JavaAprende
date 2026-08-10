import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitar la edad
        System.out.print("Ingresa tu edad en años: ");
        int edad = teclado.nextInt();

        // 2. Cálculos y 3. Mostrar los resultados
        System.out.println("Décadas: " + (edad / 10));
        System.out.println("Lustros: " + (edad / 5));
        System.out.println("Meses: " + (edad * 12));
        System.out.println("Semanas: " + (edad * 52));
        System.out.println("Días: " + (edad * 365));
        System.out.println("Horas: " + (edad * 8760));
        System.out.println("Minutos: " + (edad * 525600));
    }
}