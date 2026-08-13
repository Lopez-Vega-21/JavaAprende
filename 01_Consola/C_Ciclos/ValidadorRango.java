import java.util.Scanner;

public class ValidadorRango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double calificacion;
        
        do {
            System.out.print("Ingrese una calificación (entre 0 y 10): ");
            calificacion = teclado.nextDouble();
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Calificación inválida. Intente de nuevo.");
            }
        } while (calificacion < 0 || calificacion > 10);
        
        System.out.println("Calificación aceptada: " + calificacion);
    }
}
