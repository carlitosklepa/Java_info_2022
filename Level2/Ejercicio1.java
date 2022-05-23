package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese sus 3 ciudades favoritas:");

        System.out.println("Primer ciudad");
        String ciudad1 = scan.nextLine();
        ciudades.add(0, ciudad1);

        System.out.println("Segunda ciudad:");
        String ciudad2 = scan.nextLine();
        ciudades.add(0, ciudad1);

        System.out.println("Tercera ciudad:");
        String ciudad3 = scan.nextLine();
        ciudades.add(0, ciudad1);
        
        scan.close();

        System.out.println("#1 - " + ciudad1);
        System.out.println("#2 - " + ciudad2);
        System.out.println("#3 - " + ciudad3);

    }
    
}
