package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        cargaLista(numeros);

        System.out.println("El tamaño inicial de la lista es: " + numeros.size());

        numeros.add(0, 6);
        numeros.add(7);

        System.out.println("El tamaño final de la lista es: " + numeros.size());

        for (Integer numero: numeros) {
            System.out.println(numero);
        }
    }
    
    public static void cargaLista(List<Integer> numeros) {
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
    }
}
