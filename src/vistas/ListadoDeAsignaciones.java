package vistas;

import java.util.ArrayList;
import java.util.Scanner;

import controladores.CreadorDeConductoresVehiculosRutas;
import modelos.Asignacion;

public class ListadoDeAsignaciones {

    public static void listarAsignaciones(Scanner scanner) {
        ArrayList<Asignacion> asignaciones = CreadorDeConductoresVehiculosRutas.getAsignaciones();

        System.out.println("--------------------------------------------------------");
        System.out.println("Listado de asignaciones existentes:");
        System.out.println("--------------------------------------------------------");

        if (asignaciones.isEmpty()) {
            System.out.println("No hay asignaciones registradas aún.");
        } else {
            int numero = 1;
            for (Asignacion asignacion : asignaciones) {
                System.out.println("Asignación #" + numero);
                asignacion.mostrarInformacion();
                System.out.println();
                numero++;
            }
        }

        System.out.println("Presione Enter para volver al menú principal...");
        scanner.nextLine();
    }

}