import java.util.Scanner;

public class SalarioDinamico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el salario base: ");
        double salarioBase = teclado.nextDouble();
        
        if (salarioBase < 0) {
            System.out.println("Error: El salario no puede ser negativo.");
        } else {
            double compensacion = salarioBase * 0.02;
            double subtotal = salarioBase + compensacion;
            double imss = subtotal * 0.05;
            double ispt = subtotal * 0.03;
            double salarioNeto = subtotal - (imss + ispt);
            
            System.out.println("Salario neto recalculado con compensación y descuentos: $" + salarioNeto);
        }
    }
}
