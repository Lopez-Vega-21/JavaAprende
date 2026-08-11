import java.util.Scanner;

public class ConvertidorCentimetros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar los centímetros
        System.out.print("Ingresa la cantidad en centímetros: ");
        double centimetros = teclado.nextDouble();
        
        // 2. Realizar la conversión dividiendo entre 2.54
        double pulgadas = centimetros / 2.54;
        
        // 3. Imprimir el resultado en el formato solicitado
        System.out.println(centimetros + " cm equivalen a " + pulgadas + " pulgadas.");
        
        teclado.close();
    }
}