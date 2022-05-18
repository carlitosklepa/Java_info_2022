package Level1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre completo:");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        scan.close();

        System.out.println("Hola " + nombre + "!!!");
    }
}
