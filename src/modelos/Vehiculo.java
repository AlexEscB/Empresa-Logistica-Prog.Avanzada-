package modelos;

public class Vehiculo {

    public String modelo;
    public String color;
    private String placa;
    public String marca;

    public Vehiculo(String modelo, String color, String marca, String placa) {
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void mostrarInformacion() {
        System.out.println("VEHÍCULO:");
        System.out.println("  Marca: " + marca);
        System.out.println("  Modelo: " + modelo);
        System.out.println("  Color: " + color);
        System.out.println("  Placa: " + placa);
    }

}