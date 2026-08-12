import java.util.Scanner;

public class KilogramosLibras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el peso en kilogramos: ");
        double kilos = teclado.nextDouble();
        
        double libras = kilos * 2.2;
        
        System.out.println(kilos + " kg equivalen a " + libras + " libras.");
        
        teclado.close();
    }
}