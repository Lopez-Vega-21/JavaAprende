import java.util.Scanner;

public class ConvertidorCentimetros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad en centímetros: ");
        double centimetros = teclado.nextDouble();
        
        double pulgadas = centimetros / 2.54;
        
        System.out.println(centimetros + " cm equivalen a " + pulgadas + " pulgadas.");
        
        teclado.close();
    }
}