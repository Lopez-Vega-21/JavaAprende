import java.util.Scanner;

public class FiltrarCalificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorAprobatorias = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = teclado.nextDouble();
            
            if (calificacion >= 6 && calificacion <= 10) {
                contadorAprobatorias++;
            }
        }
        
        System.out.println("Cantidad de calificaciones aprobatorias (entre 6 y 10): " + contadorAprobatorias);
    }
}
