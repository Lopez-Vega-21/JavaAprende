import java.util.Scanner;

public class CalculadoraCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el radio del círculo: ");
        double radio = teclado.nextDouble();
        
        double perimetro = 2 * Math.PI * radio;
        
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: " + area);
        
        teclado.close();
    }
}
