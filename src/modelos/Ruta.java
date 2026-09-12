package modelos;

public class Ruta{

    public String nombre;
    public String origen;
    public String destino;
    public int distancia;
    public int tiempoEstimado;
    public Conductor conductor;

    public Ruta(String nombre, String origen, String destino, int distancia, int tiempoEstimado){
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempoEstimado = tiempoEstimado;


    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }



    
}