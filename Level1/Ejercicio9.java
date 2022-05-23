package Level1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra, frase o texto:");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();

        System.out.println("Ingrese el caracter a buscar:");
        char letra = scan.next().charAt(0);

        int totalLetra = 0;
        char temp;

        for(int x = 0; x < texto.length(); x++) {
            temp = texto.charAt(x);
            if(temp == letra) {
                totalLetra++;
            }
        }
        System.out.println("Dentro del texto hay " + totalLetra + " de la letra " + letra);
    }
}
