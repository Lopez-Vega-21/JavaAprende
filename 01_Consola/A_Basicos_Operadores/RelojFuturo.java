import java.util.Scanner;

public class RelojFuturo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la hora actual:");
        int hora = sc.nextInt();
        
        System.out.println("Ingresa las horas a avanzar:");
        int horasAvanzar = sc.nextInt();
        
        int horaFinal = (hora + horasAvanzar) % 24;
        
        System.out.println("El reloj marcará las: " + horaFinal);
    }
}
