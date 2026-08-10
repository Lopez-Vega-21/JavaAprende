import java.util.Scanner;

public class CalculadoraCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar el radio
        System.out.print("Introduce el radio del círculo: ");
        double radio = teclado.nextDouble();
        
        // Calcular el perímetro (2 * PI * radio)
        double perimetro = 2 * Math.PI * radio;
        
        // Calcular el área (PI * radio^2)
        double area = Math.PI * Math.pow(radio, 2);
        
        // Mostrar los resultados
        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: " + area);
        
        teclado.close();
    }
}
