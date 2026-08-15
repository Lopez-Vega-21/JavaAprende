import java.util.Scanner;

public class VentaBates {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de bates comprados: ");
        int cantidad = teclado.nextInt();
        int precioUnitario;
        
        if (cantidad >= 10) {
            precioUnitario = 100;
        } else {
            precioUnitario = 108;
        }
        
        int costoTotal = cantidad * precioUnitario;
        System.out.println("El costo total por " + cantidad + " bates es: $" + costoTotal);
    }
‎}