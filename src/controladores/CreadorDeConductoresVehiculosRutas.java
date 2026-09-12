package controladores;

import java.util.ArrayList;


import modelos.Conductor;
import modelos.Ruta;
import modelos.Vehiculo;

public class CreadorDeConductoresVehiculosRutas {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Juan Pérez", 123456789, java.time.LocalDate.of(1990, 1, 1), 30, "O+", "Calle Principal #123", 987654321);
        Conductor conductor2 = new Conductor("Maria Gomez", 987654321, java.time.LocalDate.of(1985, 5, 15), 35, "A-", "Avenida Central #456", 123456789);
        Conductor conductor3 = new Conductor("Carlos Rodriguez", 456789123, java.time.LocalDate.of(1995, 10, 20), 28, "B+", "Calle Secundaria #789", 456789123);
        Vehiculo vehiculo = new Vehiculo("Sedan", "Rojo", "Toyota", "ABC123");
        Vehiculo vehiculo2 = new Vehiculo("SUV", "Azul", "Honda", "XYZ789");
        Vehiculo vehiculo3 = new Vehiculo("Camioneta", "Negro", "Ford", "DEF456");
        Ruta ruta = new Ruta("Ruta 1", "Bogota", "Bucaramanga", 390, 526);
        Ruta ruta2 = new Ruta("Ruta 2", "Bogota", "Medellin", 417, 526);
        Ruta ruta3 = new Ruta("Ruta 3", "Bucaramanga", "Medellin", 136, 170);

        ArrayList<Conductor> conductores = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Ruta> rutas = new ArrayList<>();

        conductores.add(conductor);
        conductores.add(conductor2);
        conductores.add(conductor3);
        vehiculos.add(vehiculo);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo);
        rutas.add(ruta);
        rutas.add(ruta2);
        rutas.add(ruta3);

    }

}
