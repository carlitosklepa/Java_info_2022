import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        //Inicializar ArrayList (ejemplos de constructores)
        List<Integer> dnis = new ArrayList<Integer>();
        List<String> nombres = new ArrayList<>();

        //Operaciones de inserción
        dnis.add(32494104);
        dnis.add(38765666);
        dnis.add(38201017);

        nombres.add("bob esponja");
        nombres.add("Rey Arturo");
        nombres.add("Robert de Niro");
        nombres.add("Cacho Espinosa");
        cargaLista(nombres);

        System.out.println("Los elementos de la lista DNI son: " + dnis.size());
        System.out.println("Los elementos de la lista NOMBRES son: " + nombres.size());
        System.out.println(nombres.size() == dnis.size());

        //Operaciones de acceso
        System.out.println("El elemento " + 1 + " de la lista DNI es: " + dnis.get(1));
        System.out.println("El elemento " + (nombres.size() - 1) + " de la lista NOMBRES es: " + nombres.get((nombres.size() - 1))); //Accede al último elemento de la lista

        for (String nombre : nombres) {
            System.out.println(nombre);
            
        }

        //Operaciones de eliminar
        nombres.remove("Rey Arturo");
        System.out.println("Los elementos de la lista NOMBRES son: " + nombres.size());
        
        dnis.remove(1);
        System.out.println("Los elementos de la lista DNI son: " + dnis.size());

    }
    public static void cargaLista(List<String> nombres) {
        nombres.add("Camilo");
        nombres.add("Profe Castillo");
    }
}