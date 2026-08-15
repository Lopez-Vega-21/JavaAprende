import java.util.Scanner;

public class TeoremaPitagoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el cateto a: ");
        double a = teclado.nextDouble();
        
        System.out.print("Ingresa el cateto b: ");
        double b = teclado.nextDouble();
        
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("La hipotenusa es: " + c);
        
        teclado.close();
    }
}