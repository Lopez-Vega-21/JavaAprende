import java.util.Scanner;

public class CalificacionesAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i + ":");
            double suma = 0;
            
            for (int j = 1; j <= 3; j++) {
                System.out.print("  Ingrese la calificación " + j + ": ");
                double calificacion = teclado.nextDouble();
                suma += calificacion;
            }
            
            double promedio = suma / 3;
            System.out.println("  Promedio del alumno " + i + ": " + promedio);
            System.out.println();
        }
    }
}
