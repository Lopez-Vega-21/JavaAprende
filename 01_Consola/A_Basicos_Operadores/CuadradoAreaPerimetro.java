import java.util.Scanner;

public class CuadradoAreaPerimetro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar el lado
        System.out.print("Ingresa el valor del lado del cuadrado: ");
        double lado = teclado.nextDouble();
        
        // 2. Calcular área (lado * lado) y perímetro (lado * 4)
        double area = lado * lado;
        double perimetro = lado * 4;
        
        // 3. Imprimir resultados
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        
        teclado.close();
    }
}