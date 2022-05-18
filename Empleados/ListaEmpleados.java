package Empleados;

import java.util.ArrayList;

public class ListaEmpleados {
    public void ListEmpleados() {
    ArrayList<Empleado> empleados = new ArrayList<>();
    
    empleados.add(new Empleado(1234, "Homero Simpson"));
    empleados.add(new Empleado(2345, "Pedro Picapiedra"));
    empleados.add(new Empleado(3456, "Pablo Marmol"));
    empleados.add(new Empleado(4567, "Peter Parker"));
    empleados.add(new Empleado(5678, "Clark Kent"));

    }
}
