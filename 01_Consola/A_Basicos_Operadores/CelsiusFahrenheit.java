import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitar grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = teclado.nextDouble();

        // 2. Aplicar la fórmula: (C * 9/5) + 32 = F
        // Usamos 9.0 y 5.0 para asegurar la precisión decimal
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // 3. Imprimir resultado
        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F.");
    }
}
