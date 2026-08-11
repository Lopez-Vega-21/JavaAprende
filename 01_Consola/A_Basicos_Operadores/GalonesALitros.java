import java.util.Scanner;

public class GalonesALitros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar galones
        System.out.print("Ingresa la cantidad en galones: ");
        double galones = teclado.nextDouble();
        
        // 2. Convertir a litros
        double litros = galones * 3.78541;
        
        // 3. Imprimir
        System.out.println(galones + " galones equivalen a " + litros + " litros.");
        
        teclado.close();
    }
}