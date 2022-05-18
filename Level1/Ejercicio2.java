package Level1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero:");
        int x = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero:");
        int y = scan.nextInt();
        scan.close();
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " / " + y + " = " + (x/y));
        System.out.println(x + " % " + y + " = " + (x%y));
    }
}
//suma, resta, multiplicación, división y módulo