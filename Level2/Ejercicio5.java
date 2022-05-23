package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args){
        List<Integer> horas = new ArrayList<>();
        horas = List.of(6, 7, 8, 4, 5);
        List<Integer> valorHoras = new ArrayList<>();
        valorHoras = List.of(350, 345, 550, 600, 320);
        List<Integer> valor = new ArrayList<>();
        int total = 0;

        for(int x=0; x<5; x++){
            valor.add(horas.get(x) * valorHoras.get(x));
            total += valor.get(x);
        }

       System.out.println(total);
    }
}
