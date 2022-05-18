import java.util.HashMap;
import java.util.Map;


public class HashMapExamples {
    public static void main(String[] args) {
        Map<Integer, String> dnis = new HashMap<>();
        Map<String, String> personajesShow = new HashMap<>();

        dnis.put(1000, "Calamaro");
        dnis.put(2000, "Cerati");
        dnis.put(3000, "Garcia");

        personajesShow.put("Calamaro", "Cantante");
        personajesShow.put("Cerati", "Cantante");
        personajesShow.put("Garcia", "Cantante");
        personajesShow.put("Garcia", "Pianista"); //Agregamos una clave repetida a ver que pasa con el size

        System.out.println("La lista DNI tiene: " + dnis.size());
        System.out.println("La lista NOMBRES tiene: " + personajesShow.size()); //Por el tamaño notamos que si se repite la clave, mantiene solo uno de los valores

        //Operaciones de acceso
        System.out.println(personajesShow.get("Garcia")); //Buscamos por clave, nos devuelve el valor. Podemos ver que con clave repetida, mantiene el ULTIMO valor

        //Operaciones de eliminar
        personajesShow.remove("Garcia");
        System.out.println("La lista NOMBRES tiene: " + personajesShow.size());
        System.out.println(personajesShow.get("Garcia")); //Cuando eliminamos un elemento que tenia clave repetida, elimina la última, no conserva ninguna
        
    }
}