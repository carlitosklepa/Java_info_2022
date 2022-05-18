import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<Long> dnis = new HashSet<Long>();
        Set<String> nombres = new HashSet<>();

        dnis.add(Long.valueOf(234982735));
        dnis.add(Long.valueOf(292349827));

        nombres.add("Calamaro");
        nombres.add("Cerati");
        nombres.add("Garcia");

        cargarSet(nombres);

        System.out.println("La lista de dnis: " + dnis.size());
        System.out.println("La lista de nombres: " + nombres.size());
        System.out.println(dnis.size() == nombres.size());

        //Operaciones de acceso - Al ser Set no tendremos índice ¿Como accedemos? Iterando
        for (String nombre: nombres) { //Recorremos
            System.out.println(nombre); //nombre es la variable que tiene el valor asignado del elemento en un instante dado
        }

        //Preguntamos si está presente algun elemento en el Set
        System.out.println("Está el nombre \"Calamaro\" en el Set: " + nombres.contains("Calamaro"));

        nombres.remove("Calamaro");
        System.out.println("La lista de nombres: " + nombres.size());

        for (String nombre: nombres) {
            System.out.println(nombre);
        }
    }
    public static void cargarSet(Set<String> nombres){
        nombres.add("Baiano");
        nombres.add("Fito");
        nombres.add("Baileron");
    }
}