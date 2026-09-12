package modelos;

public class Asignacion {
    private Conductor conductor;
    private Vehiculo vehiculo;
    private Ruta ruta;

    public Asignacion(Conductor conductor, Vehiculo vehiculo, Ruta ruta) {
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.ruta = ruta;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void mostrarInformacion() {
        System.out.println("========================================================");
        System.out.println("ASIGNACIÓN");
        System.out.println("========================================================");
        conductor.mostrarInformacion();
        System.out.println("--------------------------------------------------------");
        vehiculo.mostrarInformacion();
        System.out.println("--------------------------------------------------------");
        ruta.mostrarInformacion();
    }

}