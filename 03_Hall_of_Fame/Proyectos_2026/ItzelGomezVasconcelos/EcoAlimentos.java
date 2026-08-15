import java.util.Scanner;

public class EcoAlimentos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicio de sesión al abrir la aplicación
        System.out.println("===============================");
        System.out.println("   INICIO DE SESIÓN - ECO-APP  ");
        System.out.println("===============================");
        System.out.print("Ingresa tu Gmail: ");
        String gmail = scanner.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        String password = scanner.nextLine();
        System.out.println("\n¡Bienvenido, " + gmail + "!");

        String nombre = "";
        String cantidad = ""; // Ahora acepta cualquier unidad (kg, litros, piezas, etc.)
        int dias = 0;
        boolean registrado = false;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- ECO-ALIMENTOS ---");
            System.out.println("1. Registrar alimento\n2. Ver mi alimento\n3. Ver recetas\n4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: ");
                nombre = scanner.nextLine();
                System.out.print("Cantidad y unidad (ej. 1.5 litros, 3 piezas, 500g): ");
                cantidad = scanner.nextLine(); // Lee texto con cualquier tipo de medida
                System.out.print("Días para caducar: ");
                dias = scanner.nextInt();
                scanner.nextLine();
                registrado = true;
                System.out.println("¡Guardado!");

            } else if (opcion == 2) {
                if (registrado) {
                    System.out.println("\n[Alimento] " + nombre + " | " + cantidad + " | Vence en: " + dias + " días");
                    if (dias <= 3) System.out.println("Próximo a caducar.");
                } else {
                    System.out.println("No hay registros.");
                }

            } else if (opcion == 3) {
                if (registrado) {
                    System.out.println("\n--- RECETAS RECOMENDADAS PARA: " + nombre + " ---");
                    
                    String alimento = nombre.toLowerCase();

                    if (alimento.contains("pollo") || alimento.contains("carne")) {
                        System.out.println("• Idea: Desmenuza y prepara unos tacos, sincronizadas o una sopa caliente.");
                    } else if (alimento.contains("pan")) {
                        System.out.println("• Idea: Prepara unas tostadas francesas o córtalo en cubitos para hacer crotones.");
                    } else if (alimento.contains("manzana") || alimento.contains("plátano") || alimento.contains("fruta")) {
                        System.out.println("• Idea: Haz un batido o licuado energético con leche o yogur.");
                    } else if (alimento.contains("verdura") || alimento.contains("tomate") || alimento.contains("cebolla")) {
                        System.out.println("• Idea: Prepáralo en un guisado salteado o haz una crema casera.");
                    } else {
                        System.out.println("• Idea: Prepáralo en un guisado rápido, sopa o evalúa congelarlo.");
                    }

                    String busqueda = nombre.replace(" ", "+");
                    System.out.println("\nBúsqueda web en Google:");
                    System.out.println("https://www.google.com/search?q=recetas+con+" + busqueda);
                } else {
                    System.out.println("Primero registra un alimento.");
                }

            } else if (opcion == 4) {
                System.out.println("¡Adiós!");
            } else {
                System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}
