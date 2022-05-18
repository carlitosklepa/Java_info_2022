package EjOOP;

public abstract class Empleado {
    //Se colocan los atributos en privado para que no puedan ser modificados directamente, puede hacerse solo desde los métodos set y get. De esta forma, los atributos están "encapsulados"
    private int dni;
    private String nombre;
    private String apellido;

    public abstract int calcularSueldo();

    //Solo se define el método si voy a querer modificar estos atributos más adelante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override //Estamos suscribiendo el método toString de la clase padre (Objects)
    public String toString() {
        return String.valueOf(this.dni) + " - " + this.nombre + " " + this.apellido;
    }
}

//Los EMPLEADOS pueden ser:
//EFECTIVO (PLANTA)
//CONTRATADO
//JORNADA