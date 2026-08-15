import java.util.Scanner;

public class PromedioFijo {
    public static void main(String[] args) {
        
        double num1 = 19;
        double num2 = 17;
        double num3 = 21;
        double num4 = 9;
        double num5 = 12;
        double num6 = 7;
        
        double suma = num1 + num2 + num3 + num4 + num5 + num6;
        double promedio = suma / 6.0;
        
        System.out.println("El promedio es: " + promedio);
    }
}