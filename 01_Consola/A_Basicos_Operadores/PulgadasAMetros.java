import java.util.Scanner;

public class PulgadasAMetros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce las pulgadas:");
        double pulgadas = sc.nextDouble();
        
        double metros = pulgadas * 0.0254;
        
        System.out.println("Son " + metros + " metros");
    }
}