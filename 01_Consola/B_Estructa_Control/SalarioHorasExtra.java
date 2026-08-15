import java.util.Scanner;

public class SalarioHorasExtra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTotales = teclado.nextInt();
        int pagoTotal;
        
        if (horasTotales <= 40) {
            pagoTotal = horasTotales * 14;
        } else {
            int horasExtra = horasTotales - 40;
            pagoTotal = (40 * 14) + (horasExtra * 26);
        }
        
        System.out.println("El pago total por " + horasTotales + " horas es: $" + pagoTotal);
    }
}