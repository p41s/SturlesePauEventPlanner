import java.util.Scanner;

public class SturlesePauMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do{

        //Mostrar el menu de opciones
        System.out.println("\nBienvenido a Event Planner. Selecciona una opción\n");
        System.out.println("[1] Añadir evento");
        System.out.println("[2] Borrar evento");
        System.out.println("[3] Listar eventos");
        System.out.println("[4] Marcar/desmarcar tarea de u1n evento como completado");
        System.out.println("[5] Salir");

        option= scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 1:
                System.out.println("[1] Añadir evento");
                break;
            case 2:
                 System.out.println("[2] Borrar evento");
                 break;
            case 3:
                 System.out.println("[3] Listar eventos");
                 break;
            case 4:
                 System.out.println("[4] Marcar/desmarcar tarea de un evento como completado");
                 break;
            case 5:
                 System.out.println("[5] Salir");
                 break;
            default:
                 System.out.println("Porfavor introduzca una opción valida");
            }

        }while (option != 5);
    }
}



