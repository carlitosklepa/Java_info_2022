import java.util.Scanner;

//Debemos realizar un programa que nos realizará una pregunta si queremos
//realizar una operación dada o si deseamos salir/terminar el programa.
//Utilizaremos en este caso una simple operación que nos pide un número y luego
//lo imprime.

public class Ej6PracticaGuiada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resp = 1;
        int x;

        do {
            System.out.println("Ingrese un numero entero");
            x = scan.nextInt();
            System.out.println("El numero ingresado fue: " + x);
            System.out.println("Desea trabajar hoy? (1 = si):");
            resp = scan.nextInt();
        } while (resp == 1);
        scan.close();
    }
}
