import java.util.Scanner;

public class GalonesALitros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad en galones: ");
        double galones = teclado.nextDouble();
        
        double litros = galones * 3.78541;
        
        System.out.println(galones + " galones equivalen a " + litros + " litros.");
        
        teclado.close();
    }
}