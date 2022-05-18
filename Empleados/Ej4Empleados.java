package Empleados;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ej4Empleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado(1234, "Homero Simpson"));
        empleados.add(new Empleado(2345, "Pedro Picapiedra"));
        empleados.add(new Empleado(3456, "Pablo Marmol"));
        empleados.add(new Empleado(4567, "Peter Parker"));
        empleados.add(new Empleado(5678, "Clark Kent"));
        try {
            File listaDeEmpleados = new File(
                    "/Users/carlitos/Documents/InformatorioE3/Java/Proyectos/Java_info_2022/Empleados/empleado.txt");
            if (listaDeEmpleados.createNewFile()) {
                System.out.println("El archivo " + listaDeEmpleados.getName() + " fue creado exitosamente");
                FileWriter listaDeEmp = new FileWriter(
                        "/Users/carlitos/Documents/InformatorioE3/Java/Proyectos/Java_info_2022/Empleados/empleado.txt");
                for (Empleado emp: empleados) {
                    listaDeEmp.write(emp.toString()+'\n');
                }
                listaDeEmp.close();
            } else {
                System.out.println("El archivo ya exite");
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }

        // public class CargarArchivo {

    }
}
