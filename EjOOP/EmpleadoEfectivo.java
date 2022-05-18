package EjOOP;
//Aplicamos herencia: EmpleadoEfectivo es hijo de Empleado, está heredando
public class EmpleadoEfectivo extends Empleado {
    private int sueldo;
    private int antiguedad;

    public EmpleadoEfectivo(int dni, String nombre, String apellido, int sueldo, int antiguedad) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    @Override //Método que si o si tengo que implementar porque está definido en la clase padre como "abstract"
    public int calcularSueldo() {
        return (this.sueldo + (this.antiguedad * 1000));
    }
    
}
