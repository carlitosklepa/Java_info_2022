import java.util.Scanner;

public class Ej5PracticaGuiada {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero entre 1 y 10:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for(int mult = 1; mult <= 10; mult++) {
            System.out.println(num + " * " + mult + " = " + (num*mult));
        }

    }
}
