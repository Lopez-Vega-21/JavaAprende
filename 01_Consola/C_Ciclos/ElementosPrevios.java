import java.util.Scanner;

public class ElementosPrevios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();
        
        System.out.println("Elementos anteriores:");
        for (int i = 1; i < numero; i++) {
            System.out.println(i);
        }
    }
}
