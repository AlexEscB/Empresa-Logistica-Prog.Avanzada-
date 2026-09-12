package vistas;

import java.util.Scanner;

public class Principal {

    public static void seleccionarOpcion(Scanner scanner) {

        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Bienvenido al sistema de gestión de conductores, vehículos y rutas.");
            System.out.println("--------------------------------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar vehículo.");
            System.out.println("2. Registrar ruta.");
            System.out.println("3. Registrar conductor.");
            System.out.println("4. Crear asignación (conductor, vehículo y ruta).");
            System.out.println("5. Listar asignaciones existentes.");
            System.out.println("6. Salir.");
            System.out.println("--------------------------------------------------------");

            System.out.println("Ingrese el número de la opción deseada:");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    CrearCoRuVeh.registrarVehiculo(scanner);
                    break;
                case 2:
                    CrearCoRuVeh.registrarRuta(scanner);
                    break;
                case 3:
                    CrearCoRuVeh.registrarConductor(scanner);
                    break;
                case 4:
                    CrearCoRuVeh.crearAsignacion(scanner);
                    break;
                case 5:
                    ListadoDeAsignaciones.listarAsignaciones(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

    }

}