package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        alumnos = List.of("Gonzalez", "Rodriguez", "Gomez", "Fernandez", "Lopez", "Diaz", "Martinez", "Perez", "Romero", "Sanchez", "Garcia", "Sosa");
        
        List<String> grupo1 = new ArrayList<>(alumnos.subList(0, 3));
        List<String> grupo2 = new ArrayList<>(alumnos.subList(4, 7));
        List<String> grupo3 = new ArrayList<>(alumnos.subList(8, 11));
        
        System.out.println("El grupo 1 esta compuesto por:");
        for (String alumno: grupo1) {
            System.out.print(alumno + " ");
        }
        
        System.out.println("\nEl grupo 2 esta compuesto por:");
        for (String alumno: grupo2) {
            System.out.print(alumno + " ");
        }

        System.out.println("\nEl grupo 3 esta compuesto por:");
        for (String alumno: grupo3) {
            System.out.print(alumno + " ");
        }
    }
}