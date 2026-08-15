import java.util.Scanner;

public class LapicesColores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de lápices que desea comprar: ");
        int cantidad = teclado.nextInt();
        double precioUnitario;
        
        if (cantidad >= 100) {
            precioUnitario = 0.80;
        } else if (cantidad >= 51) {
            precioUnitario = 1.20;
        } else if (cantidad >= 30) {
            precioUnitario = 1.50;
        } else {
            precioUnitario = 2.10;
        }
        
        double costoTotal = cantidad * precioUnitario;
        System.out.println("El costo total por " + cantidad + " lápices es: $" + costoTotal);
    }
}