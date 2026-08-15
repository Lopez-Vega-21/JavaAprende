package com.mycompany.proyecto;
import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ARRAYS para guardar la información
        String[] nombresAlimentos = new String[100];
        double[] cantidadesKg = new double[100];
        String[] fechasCaducidad = new String[100];
        int totalAlimentos = 0; // Contador de cuántos alimentos hay guardados
        
        // Variables para el menú
        int opcion = 0;
        
        // Mensaje de bienvenida
        System.out.println("=== SISTEMA DE DONACIÓN DE ALIMENTOS ===");
        System.out.println("Ayudando a reducir el desperdicio en México");
        System.out.println();
        
        // Ciclo principal del programa
        while (opcion != 4) {
            // Mostrar menú
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Agregar un alimento donado");
            System.out.println("2. Ver todos los alimentos disponibles");
            System.out.println("3. Donar alimento a la comunidad");
            System.out.println("4. Salir del sistema");
            System.out.print("Elige una opción (1-4): ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            System.out.println(); // Línea en blanco para orden
            
            // Evaluar la opción elegida
            if (opcion == 1) {
                // AGREGAR ALIMENTO
                System.out.println("--- NUEVA DONACIÓN ---");
                
                System.out.print("Nombre del alimento: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Cantidad en kilogramos: ");
                double cantidad = scanner.nextDouble();
                scanner.nextLine();
                
                System.out.print("Fecha de caducidad (ej. 2026-12-31): ");
                String fecha = scanner.nextLine();
                
                // Guardar en los arrays
                nombresAlimentos[totalAlimentos] = nombre;
                cantidadesKg[totalAlimentos] = cantidad;
                fechasCaducidad[totalAlimentos] = fecha;
                totalAlimentos++;
                
                System.out.println("¡Alimento registrado con éxito!");
                System.out.println("Ahora hay " + totalAlimentos + " alimentos en el banco.");
                System.out.println();
                
            } else if (opcion == 2) {
                // VER ALIMENTOS
                System.out.println("--- ALIMENTOS DISPONIBLES ---");
                
                if (totalAlimentos == 0) {
                    System.out.println("No hay alimentos registrados aún.");
                } else {
                    // Ciclo for para mostrar todos los alimentos
                    for (int i = 0; i < totalAlimentos; i++) {
                        System.out.println((i + 1) + ". " + nombresAlimentos[i] + 
                                         " | " + cantidadesKg[i] + " kg | " + 
                                         "Caduca: " + fechasCaducidad[i]);
                    }
                    System.out.println("Total: " + totalAlimentos + " alimentos");
                }
                System.out.println();
                
            } else if (opcion == 3) {
                // DONAR A LA COMUNIDAD
                System.out.println("--- DONAR A LA COMUNIDAD ---");
                
                if (totalAlimentos == 0) {
                    System.out.println("No hay alimentos para donar. Primero agrega donaciones.");
                } else {
                    // Mostrar lista para que elija
                    System.out.println("Elige el número del alimento a donar:");
                    for (int i = 0; i < totalAlimentos; i++) {
                        System.out.println((i + 1) + ". " + nombresAlimentos[i] + 
                                         " (" + cantidadesKg[i] + " kg)");
                    }
                    
                    System.out.print("Número del alimento: ");
                    int indiceDonar = scanner.nextInt() - 1;
                    
                    // Validar que el número sea correcto
                    if (indiceDonar >= 0 && indiceDonar < totalAlimentos) {
                        // Mostrar qué se va a donar
                        System.out.println("Donando a la comunidad: " + 
                                         nombresAlimentos[indiceDonar] + " (" + 
                                         cantidadesKg[indiceDonar] + " kg)");
                        
                        // Eliminar el alimento (correr los elementos hacia atrás)
                        for (int i = indiceDonar; i < totalAlimentos - 1; i++) {
                            nombresAlimentos[i] = nombresAlimentos[i + 1];
                            cantidadesKg[i] = cantidadesKg[i + 1];
                            fechasCaducidad[i] = fechasCaducidad[i + 1];
                        }
                        totalAlimentos--;
                        
                        System.out.println("¡Donación exitosa! Alimento entregado a la comunidad.");
                        System.out.println("Quedan " + totalAlimentos + " alimentos en el banco.");
                    } else {
                        System.out.println("Número inválido. Intenta de nuevo.");
                    }
                }
                System.out.println();
                
            } else if (opcion == 4) {
                // SALIR
                System.out.println("Gracias por usar el sistema. ¡A reducir el desperdicio!");
                System.out.println("Total de alimentos procesados: " + totalAlimentos);
                
            } else {
                // OPCIÓN NO VÁLIDA
                System.out.println("Opción no válida. Elige un número del 1 al 4.");
                System.out.println();
            }
        }
        
        scanner.close();
    }
}