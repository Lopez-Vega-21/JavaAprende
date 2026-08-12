import java.util.Scanner;

public class VentaBatesPremium {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de bates: ");
        int cantidad = teclado.nextInt();
        int total;
        
        if (cantidad <= 10) {
            total = cantidad * 250;
        } else {
            total = (10 * 250) + ((cantidad - 10) * 230);
        }
        
        System.out.println("El costo total es: $" + total);
    }
}