import java.util.Scanner;

public class Ej4PracticaGuiada {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero entre el 1 y el 7 para saber el dia de la semana:");
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
    
}
