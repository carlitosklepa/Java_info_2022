package Level1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero:");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();

        for (int x = 1; x <= numero; x++) {
            for (int y = 1; y<=x; y++) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
    }
    
}
