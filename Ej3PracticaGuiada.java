import java.util.Scanner;

public class Ej3PracticaGuiada {
    public static void main(String[] args) {
        System.out.println("Ingrese la nota de la evaluacion:");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
        
        if(nota>=93 && nota<=100){
            System.out.println("Excelente");
        } else if (nota>=85 && nota<93){
            System.out.println("Sobresaliente");
        } else if (nota>=75 && nota<85){
            System.out.println("Distinguido");
        } else if (nota>=60 && nota<77){
            System.out.println("Bueno");
        } else if (nota>=0 && nota<59){
            System.out.println("Desaprobado");
        }else{
            System.out.println("Nota fuera de rango");
        }
    }

}
