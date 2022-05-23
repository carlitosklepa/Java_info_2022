// Crear una función que dado 2 argumentos (int, siendo el primero menor al
// segundo), nos devuelva un array de Strings. Con la secuencia de números
// enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
// “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
// “FizzBuzz”.
// Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
// segundo con qué valor debe frenar (no se incluye en el cálculo)
// Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

package Level2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca 2 numeros enteros:");
        Scanner scan = new Scanner(System.in);

        System.out.println("Primer numero:");
        int numero1 = scan.nextInt();
        System.out.println("Segundo numero:");
        int numero2 = scan.nextInt();
        scan.close();

        calcularIntervalo(numero1, numero2);
    }

    public static String[] calcularIntervalo(int num1, int num2) {
        String [] intervalo = new String[num2 - num1];
        int y=0;
        for(int x=num1; x<num2; x++){
            String s = Integer.toString(x);
            intervalo[y] = s;
            if (x % 2 == 0 && x % 3 == 0){
                System.out.print("FizzBuzz" + " ");
            } else if (x % 3 == 0){
                System.out.print("Buzz" + " ");
            } else if (x % 2 == 0){
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(intervalo[y] + " ");
            }
            y += 1;
        }
        return intervalo;
    }
}
