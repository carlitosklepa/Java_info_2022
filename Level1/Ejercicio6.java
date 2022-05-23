package Level1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la base de la potencia:");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el exponente de la potencia:");
        int numero2 = scan.nextInt();
        int y = 1;

        for (int x = 1; x <= numero1; x++) {
            y*=numero2; 
        }
        System.out.println("El resultado de " + numero1 + " elevado a " + numero2 + " = " + y);
    }
    
}
