import java.util.Scanner;

public class PiesAMetros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa la medida en pies: ");
        double pies = teclado.nextDouble();
        
        double metros = pies * 0.3048;
        
        System.out.println(pies + " pies equivalen a " + metros + " metros.");
        
        teclado.close();
    }
}