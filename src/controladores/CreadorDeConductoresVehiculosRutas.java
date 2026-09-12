package controladores;

import java.util.ArrayList;

import modelos.Asignacion;
import modelos.Conductor;
import modelos.Ruta;
import modelos.Vehiculo;

public class CreadorDeConductoresVehiculosRutas {
    private static ArrayList<Conductor> conductores = new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Ruta> rutas = new ArrayList<>();
    private static ArrayList<Asignacion> asignaciones = new ArrayList<>();
    private static boolean datosCargados = false;

    public static void inicializarDatos() {
        if (datosCargados) {
            return;
        }

        Conductor conductor = new Conductor("Juan Pérez", 123456789, java.time.LocalDate.of(1990, 1, 1), 30, "O+", "Calle Principal #123", 987654321);
        Conductor conductor2 = new Conductor("Maria Gomez", 987654321, java.time.LocalDate.of(1985, 5, 15), 35, "A-", "Avenida Central #456", 123456789);
        Conductor conductor3 = new Conductor("Carlos Rodriguez", 456789123, java.time.LocalDate.of(1995, 10, 20), 28, "B+", "Calle Secundaria #789", 456789123);
        Vehiculo vehiculo = new Vehiculo("Sedan", "Rojo", "Toyota", "ABC123");
        Vehiculo vehiculo2 = new Vehiculo("SUV", "Azul", "Honda", "XYZ789");
        Vehiculo vehiculo3 = new Vehiculo("Camioneta", "Negro", "Ford", "DEF456");
        Ruta ruta = new Ruta("Ruta 1", "Bogota", "Bucaramanga", 390, 526);
        Ruta ruta2 = new Ruta("Ruta 2", "Bogota", "Medellin", 417, 526);
        Ruta ruta3 = new Ruta("Ruta 3", "Bucaramanga", "Medellin", 136, 170);

        conductores.add(conductor);
        conductores.add(conductor2);
        conductores.add(conductor3);
        vehiculos.add(vehiculo);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        rutas.add(ruta);
        rutas.add(ruta2);
        rutas.add(ruta3);

        datosCargados = true;
    }

    public static ArrayList<Conductor> getConductores() {
        return conductores;
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static ArrayList<Ruta> getRutas() {
        return rutas;
    }

    public static ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public static void registrarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public static void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public static void registrarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    public static void crearAsignacion(Conductor conductor, Vehiculo vehiculo, Ruta ruta) {
        asignaciones.add(new Asignacion(conductor, vehiculo, ruta));
    }

}