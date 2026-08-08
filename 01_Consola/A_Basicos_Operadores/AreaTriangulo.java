import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitar base y altura
        System.out.print("Ingresa la base del triángulo: ");
        double base = teclado.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = teclado.nextDouble();

        // 2. Calcular el área
        double area = (base * altura) / 2;

        // 3. Imprimir resultado
        System.out.println("El área del triángulo es: " + area);
    }
}
