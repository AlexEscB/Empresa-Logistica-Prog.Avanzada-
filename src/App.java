import java.util.Scanner;

import controladores.CreadorDeConductoresVehiculosRutas;
import vistas.Principal;

public class App {
    public static void main(String[] args) throws Exception {
        CreadorDeConductoresVehiculosRutas.inicializarDatos();
        Scanner scanner = new Scanner(System.in);
        Principal.seleccionarOpcion(scanner);
        scanner.close();
    }
}