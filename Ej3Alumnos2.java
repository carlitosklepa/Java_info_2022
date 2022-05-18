import java.io.File;
import java.util.Scanner;

public class Ej3Alumnos2 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/carlitos/Documents/InformatorioE3/Java/Proyectos/Java_info_2022/nombres.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
