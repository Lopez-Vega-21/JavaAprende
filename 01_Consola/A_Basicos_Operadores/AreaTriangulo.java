import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        double base = teclado.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = teclado.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }
}