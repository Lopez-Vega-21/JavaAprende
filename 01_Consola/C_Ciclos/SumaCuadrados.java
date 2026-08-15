public class SumaCuadrados {
    public static void main(String[] args) {
        int sumador = 0;
        
        for (int i = 1; i <= 100; i++) {
            sumador += (i * i);
        }
        
        System.out.println("La suma de los cuadrados de los 100 primeros números es: " + sumador);
    }
}
