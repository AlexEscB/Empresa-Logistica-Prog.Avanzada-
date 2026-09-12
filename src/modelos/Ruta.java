package modelos;

public class Ruta {

    public String nombre;
    public String origen;
    public String destino;
    public int distancia;
    public int tiempoEstimado;

    public Ruta(String nombre, String origen, String destino, int distancia, int tiempoEstimado) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempoEstimado = tiempoEstimado;
    }

    public void mostrarInformacion() {
        System.out.println("RUTA:");
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Origen: " + origen);
        System.out.println("  Destino: " + destino);
        System.out.println("  Distancia: " + distancia + " km");
        System.out.println("  Tiempo estimado: " + tiempoEstimado + " minutos");
    }

}