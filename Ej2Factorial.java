import java.util.Scanner;

public class Ej2Factorial {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para calcular su factorial:");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }


    
    public static int factorial(int n) {
        int resultado;
        if (n == 0) {
            resultado = 1;
        } else {
            resultado = factorial(n - 1) * n; 
        }
        return resultado;
    }
}
