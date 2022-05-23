package Level1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra en minusculas:");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        scan.close();

        char[] c_array = palabra.toCharArray();
        char caracter;

        for (int x = 0; x < c_array.length; x++) {
            caracter = (char) ((c_array[x]) & 0x5f);
            System.out.print(caracter);
        }
    }

}
