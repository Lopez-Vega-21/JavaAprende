import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F.");
    }
}
