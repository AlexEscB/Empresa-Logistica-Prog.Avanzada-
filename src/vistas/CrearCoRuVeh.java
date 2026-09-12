package vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import controladores.CreadorDeConductoresVehiculosRutas;
import modelos.Conductor;
import modelos.Ruta;
import modelos.Vehiculo;

public class CrearCoRuVeh {

    public static void registrarVehiculo(Scanner scanner) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Registro de vehículo");
        System.out.println("--------------------------------------------------------");

        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese el color del vehículo:");
        String color = scanner.nextLine();

        System.out.println("Ingrese la placa del vehículo:");
        String placa = scanner.nextLine();

        Vehiculo vehiculo = new Vehiculo(modelo, color, marca, placa);
        CreadorDeConductoresVehiculosRutas.registrarVehiculo(vehiculo);

        System.out.println("Vehículo registrado correctamente.");
        esperarEnter(scanner);
    }

    public static void registrarRuta(Scanner scanner) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Registro de ruta");
        System.out.println("--------------------------------------------------------");

        System.out.println("Ingrese el nombre de la ruta:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el origen de la ruta:");
        String origen = scanner.nextLine();

        System.out.println("Ingrese el destino de la ruta:");
        String destino = scanner.nextLine();

        System.out.println("Ingrese la distancia de la ruta (en km):");
        int distancia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el tiempo estimado de la ruta (en minutos):");
        int tiempoEstimado = scanner.nextInt();
        scanner.nextLine();

        Ruta ruta = new Ruta(nombre, origen, destino, distancia, tiempoEstimado);
        CreadorDeConductoresVehiculosRutas.registrarRuta(ruta);

        System.out.println("Ruta registrada correctamente.");
        esperarEnter(scanner);
    }

    public static void registrarConductor(Scanner scanner) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Registro de conductor");
        System.out.println("--------------------------------------------------------");

        System.out.println("Ingrese el nombre del conductor:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cédula del conductor:");
        int cedula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el año de nacimiento (ej. 1990):");
        int anio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el mes de nacimiento (1 - 12):");
        int mes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el día de nacimiento (1 - 31):");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la edad del conductor:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el grupo sanguíneo del conductor:");
        String grupoSanguineo = scanner.nextLine();

        System.out.println("Ingrese la dirección del conductor:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el contacto de emergencia del conductor:");
        int contactoDeEmergencia = scanner.nextInt();
        scanner.nextLine();

        Conductor conductor = new Conductor(nombre, cedula, LocalDate.of(anio, mes, dia),
                edad, grupoSanguineo, direccion, contactoDeEmergencia);
        CreadorDeConductoresVehiculosRutas.registrarConductor(conductor);

        System.out.println("Conductor registrado correctamente.");
        esperarEnter(scanner);
    }

    public static void crearAsignacion(Scanner scanner) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Creación de asignación");
        System.out.println("--------------------------------------------------------");

        ArrayList<Conductor> conductores = CreadorDeConductoresVehiculosRutas.getConductores();
        ArrayList<Vehiculo> vehiculos = CreadorDeConductoresVehiculosRutas.getVehiculos();
        ArrayList<Ruta> rutas = CreadorDeConductoresVehiculosRutas.getRutas();

        if (conductores.isEmpty() || vehiculos.isEmpty() || rutas.isEmpty()) {
            System.out.println("Debe haber al menos un conductor, un vehículo y una ruta registrados para crear una asignación.");
            esperarEnter(scanner);
            return;
        }

        System.out.println("Seleccione el conductor a asignar:");
        for (int i = 0; i < conductores.size(); i++) {
            System.out.println((i + 1) + ". " + conductores.get(i).nombre + " (Cédula: " + conductores.get(i).cedula + ")");
        }
        int indiceConductor = seleccionarElemento(scanner, conductores.size(), "conductor");

        System.out.println("Seleccione el vehículo a asignar:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).marca + " " + vehiculos.get(i).modelo + " (Placa: " + vehiculos.get(i).getPlaca() + ")");
        }
        int indiceVehiculo = seleccionarElemento(scanner, vehiculos.size(), "vehículo");

        System.out.println("Seleccione la ruta a asignar:");
        for (int i = 0; i < rutas.size(); i++) {
            System.out.println((i + 1) + ". " + rutas.get(i).nombre + " (" + rutas.get(i).origen + " -> " + rutas.get(i).destino + ")");
        }
        int indiceRuta = seleccionarElemento(scanner, rutas.size(), "ruta");

        CreadorDeConductoresVehiculosRutas.crearAsignacion(
                conductores.get(indiceConductor - 1),
                vehiculos.get(indiceVehiculo - 1),
                rutas.get(indiceRuta - 1));

        System.out.println("Asignación creada correctamente.");
        esperarEnter(scanner);
    }

    private static int seleccionarElemento(Scanner scanner, int cantidad, String tipo) {
        int indice;
        while (true) {
            System.out.println("Ingrese el número del " + tipo + " (1 - " + cantidad + "):");
            indice = scanner.nextInt();
            scanner.nextLine();
            if (indice >= 1 && indice <= cantidad) {
                return indice;
            }
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void esperarEnter(Scanner scanner) {
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
    }

}