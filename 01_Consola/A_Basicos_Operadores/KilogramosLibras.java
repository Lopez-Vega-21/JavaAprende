import java.util.Scanner;

public class KilogramosLibras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar los kilogramos
        System.out.print("Ingresa el peso en kilogramos: ");
        double kilos = teclado.nextDouble();
        
        // 2. Multiplicar por 2.2 para obtener las libras
        double libras = kilos * 2.2;
        
        // 3. Mostrar el resultado
        System.out.println(kilos + " kg equivalen a " + libras + " libras.");
        
        teclado.close();
    }
}