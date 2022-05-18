package Level1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero para calcular su factorial:");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        int y = 1;
        for (int x = 1; x <= numero; x++) {
            y = y * x;
        }
        System.out.println("El resultado es: " + y);
    }
}
