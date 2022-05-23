package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> barajas = new ArrayList<Integer>();
        cargarBaraja(barajas);

        System.out.println("Orden correcto:");
        for (Integer carta: barajas) {
            System.out.print(carta + " ");
        }

        System.out.println("\nOrden inverso:");
        Collections.sort(barajas, Collections.reverseOrder());
        for (Integer carta: barajas) {
            System.out.print(carta + " ");
        }

        System.out.println("\nOrden aleatorio:");
        Collections.shuffle(barajas);
        for (Integer carta: barajas) {
            System.out.print(carta + " ");
        }
    }
    
    public static void cargarBaraja(List<Integer> barajas) {
        for(int x = 2; x<=10; x++) {
            barajas.add(x);
        }
    }
}
