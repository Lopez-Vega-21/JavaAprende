public class SalarioObreroBasico {
    public static void main(String[] args) {
        
        int horasDiarias = 8;
        int diasQuincena = 15;
        double precioHora = 50.0;
        double sueldoBruto = (horasDiarias * diasQuincena) * precioHora;

        
        double compensacion = sueldoBruto * 0.02;
        double imss = sueldoBruto * 0.015;
        double ispt = sueldoBruto * 0.012;

        
        double salarioNeto = sueldoBruto + compensacion - imss - ispt;

        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Salario Neto: " + salarioNeto);
    }
}
