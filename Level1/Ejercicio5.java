package Level1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a multiplicar:");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar:");
        int numero2 = scan.nextInt();
        int y = 0;

        for (int x = 1; x <= numero1; x++) {
            y+=numero2; 
        }
        System.out.println("El resultado de la multiplicacion es: " + y);
    }
    
}