import java.util.Scanner;

public class Ej2PracticaGuiada {
    public static void main(String[] args) {
        System.out.println("A continuacion, ingrese 3 números enteros");
        System.out.println("Primer numero:");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        System.out.println("Segundo numero:");
        int numero2 = scan.nextInt();
        System.out.println("Tercer numero:");
        int numero3 = scan.nextInt();

        System.out.print("El primer nro ingresado es: " + numero1 + "\n");
        System.out.print("El segundo nro ingresado es: " + numero2 + "\n");
        System.out.print("El tercer nro ingresado es: " + numero3 + "\n");
        scan.close();
    }
}
