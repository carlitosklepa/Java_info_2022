package Level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> sueldos = new HashMap<>();

        Ejercicio6 ej6 = new Ejercicio6();

        Empleado emp1 = ej6.new Empleado(1234, "Homero Simpson", 12, 23);
        Empleado emp2 = ej6.new Empleado(2345, "Pedro Picapiedra", 35, 20);
        Empleado emp3 = ej6.new Empleado(3456, "Pablo Marmol", 48, 9);
        Empleado emp4 = ej6.new Empleado(4567, "Peter Parker", 43, 62);
        Empleado emp5 = ej6.new Empleado(5678, "Clark Kent", 90, 14);
        
        sueldos.put(emp1.ObtenerDni(), emp1.CalcularSueldo());
        sueldos.put(emp2.ObtenerDni(), emp2.CalcularSueldo());
        sueldos.put(emp3.ObtenerDni(), emp3.CalcularSueldo());
        sueldos.put(emp4.ObtenerDni(), emp4.CalcularSueldo());
        sueldos.put(emp5.ObtenerDni(), emp5.CalcularSueldo());

    }

    public class Empleado {
        private int dni;
        private String nombre;
        private int horasTrabajo;
        private int valorHora;

        public Empleado(int dni, String nombre, int horasTrabajo, int valorHora) {
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajo = horasTrabajo;
            this.valorHora = valorHora;
        }

        public int CalcularSueldo() {
            return horasTrabajo * valorHora;
        }
        public int ObtenerDni() {
            return dni;
        }
    }
}
