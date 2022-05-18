import java.util.HashMap;
import java.util.Map;

public class MapEjemplo {
    public static void main(String args[]) {
        Map<Integer, String> alumnos = new HashMap<> ();
        //Carga el map y luego muestra el tamaño
        cargarMap(alumnos);
        System.out.println("La cantidad de alumnos inscriptos es: " + alumnos.size());
        //Mostrar key y value de los elementos por iteración
        for (Map.Entry<Integer, String> registro: alumnos.entrySet()) {
            System.out.println("Id: " + registro.getKey() + " - " + "Nombre: " + registro.getValue());
        }

        //Iterar y mostrar solo las claves
        for (Integer clave: alumnos.keySet()) {
            System.out.println("Id: " + clave);
        }

        //Iterar y mostrar solo los nombres
        for(String nombre: alumnos.values()) {
            System.out.println("Nombre: " + nombre);
        }

        //Preguntar si está presente alguna key o algún valor
        System.out.println("El alumno con Id=4567 existe en el Map: " + alumnos.containsKey(4567));
        System.out.println("El alumno con nombre=Quino existe en el Map: " + alumnos.containsValue("Quino"));

        //Eliminar un elemento
        alumnos.remove(2345);
        System.out.println("La cantidad de alumnos inscriptos es: " + alumnos.size());

    }
    
    public static void cargarMap(Map<Integer, String> alumnos){
        alumnos.put(1234, "Miguel");
        alumnos.put(2345, "Mafalda");
        alumnos.put(3456, "Susanita");
        alumnos.put(4567, "Arturo");
    }
}
