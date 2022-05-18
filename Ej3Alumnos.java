import java.io.*;

public class Ej3Alumnos {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(
                "/Users/carlitos/Documents/InformatorioE3/Java/Proyectos/Java_info_2022/nombres.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
