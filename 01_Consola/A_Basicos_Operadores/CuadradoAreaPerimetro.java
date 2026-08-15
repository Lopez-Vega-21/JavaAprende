import java.util.Scanner;

public class CuadradoAreaPerimetro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el valor del lado del cuadrado: ");
        double lado = teclado.nextDouble();
        
        double area = lado * lado;
        double perimetro = lado * 4;
        
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        
        teclado.close();
    }
}