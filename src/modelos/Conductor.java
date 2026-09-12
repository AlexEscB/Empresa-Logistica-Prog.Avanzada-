package modelos;

import java.time.LocalDate;

public class Conductor{
    public String nombre;
    public int cedula;
    public  LocalDate fechaDeNacimiento;
    public int edad;
    public String grupoSanguineo;
    public String dirreccion;
    public int contactoDeEmergancia;
    public Vehiculo vehiculo;
    
    public Conductor(String nombre, int cedula, LocalDate fechaDeNacimiento, 
        int edad, String grupoSanguineo, String dirreccion, int contactoDeEmergancia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
        this.grupoSanguineo = grupoSanguineo;
        this.dirreccion = dirreccion;
        this.contactoDeEmergancia = contactoDeEmergancia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }



}