package modelos;

import java.time.LocalDate;

public class Conductor {
    public String nombre;
    public int cedula;
    public LocalDate fechaDeNacimiento;
    public int edad;
    public String grupoSanguineo;
    public String direccion;
    public int contactoDeEmergencia;

    public Conductor(String nombre, int cedula, LocalDate fechaDeNacimiento,
            int edad, String grupoSanguineo, String direccion, int contactoDeEmergencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
        this.grupoSanguineo = grupoSanguineo;
        this.direccion = direccion;
        this.contactoDeEmergencia = contactoDeEmergencia;
    }

    public void mostrarInformacion() {
        System.out.println("CONDUCTOR:");
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Cédula: " + cedula);
        System.out.println("  Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("  Edad: " + edad + " años");
        System.out.println("  Grupo sanguíneo: " + grupoSanguineo);
        System.out.println("  Dirección: " + direccion);
        System.out.println("  Contacto de emergencia: " + contactoDeEmergencia);
    }
}