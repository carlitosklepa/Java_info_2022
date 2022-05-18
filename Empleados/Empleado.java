package Empleados;

public class Empleado {
    private int dni;
    private String nombre;

    public Empleado(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return (this.dni + " - " + this.nombre);
    }
}
