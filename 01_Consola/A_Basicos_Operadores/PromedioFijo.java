import java.util.Scanner;

public class PromedioFijo {
    public static void main(String[] args) {
        // Declarar variables para los 6 números
        double num1 = 19;
        double num2 = 17;
        double num3 = 21;
        double num4 = 9;
        double num5 = 12;
        double num6 = 7;
        
        // Sumar y calcular el promedio dividiendo entre 6.0
        double suma = num1 + num2 + num3 + num4 + num5 + num6;
        double promedio = suma / 6.0;
        
        // Imprimir el resultado
        System.out.println("El promedio es: " + promedio);
    }
}