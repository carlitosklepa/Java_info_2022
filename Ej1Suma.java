import java.util.Scanner;

public class Ej1Suma {
    public static void main(String[] args) {
        System.out.println("Ingrese los dos numeros a sumar:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("La suma de los 2 numeros es: " + Sumar(num1, num2));

    }

    public static int Sumar(int x, int y) {
        return x + y;
    }
}
