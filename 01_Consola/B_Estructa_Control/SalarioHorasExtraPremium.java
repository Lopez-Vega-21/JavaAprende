import java.util.Scanner;

public class SalarioHorasExtraPremium {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el total de horas trabajadas: ");
        int horasTotales = teclado.nextInt();
        int salarioTotal;
        
        if (horasTotales <= 40) {
            salarioTotal = horasTotales * 50;
        } else {
            int horasAdicionales = horasTotales - 40;
            salarioTotal = (40 * 50) + (horasAdicionales * 70);
        }
        
        System.out.println("El salario total es: $" + salarioTotal);
    }
}
