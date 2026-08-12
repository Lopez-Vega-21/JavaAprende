import java.util.Scanner;

public class PiesAMetros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar medida en pies
        System.out.print("Ingresa la medida en pies: ");
        double pies = teclado.nextDouble();
        
        // 2. Convertir a metros
        double metros = pies * 0.3048;
        
        // 3. Imprimir
        System.out.println(pies + " pies equivalen a " + metros + " metros.");
        
        teclado.close();
    }
}