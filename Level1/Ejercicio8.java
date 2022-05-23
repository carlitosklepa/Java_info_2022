package Level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Map<String, String> datos = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido:");
        String nombre = scan.nextLine();
        datos.put("nombre y apellido", nombre);
        
        System.out.println("Ingrese su edad:");
        String edad = scan.nextLine();
        datos.put("edad", edad);
        
        System.out.println("Ingrese su direccion:");
        String direc = scan.nextLine();
        datos.put("direccion", direc);

        System.out.println("Ingrese su ciudad:");
        String ciudad = scan.nextLine();
        datos.put("ciudad", ciudad);
        scan.close();
        
        System.out.println(datos.get("ciudad") + " - " + 
        datos.get("direccion") + " - " +
        datos.get("edad") + " - " + 
        datos.get("nombre y apellido"));
    }
}
