import java.util.Scanner;

public class ContinuarSistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuesta;
        
        do {
            System.out.print("¿Desea continuar S/N?: ");
            respuesta = teclado.next().toUpperCase().charAt(0);
        } while (respuesta != 'N');
        
        System.out.println("Sistema finalizado.");
    }
}
