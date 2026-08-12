import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}