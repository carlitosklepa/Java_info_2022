package EjOOP;

public class ServicioSueldo {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoContratado(1234, "Homero", "Simpson", 30000);
        Empleado emp2 = new EmpleadoEfectivo(5678, "Pedro", "Picapiedras", 40000, 5);
        Empleado emp3 = new EmpleadoJornada(9012, "George", "Bonanza", 120, 2000);
        emp1.setNombre("Rocky"); //De esta forma cambio el valor de nombre, si los atributos no fuesen privados, lo puedo cambiar con emp1.nombre = "Rocky"
        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.calcularSueldo());
        System.out.println(emp3.calcularSueldo());
    }
    
}
