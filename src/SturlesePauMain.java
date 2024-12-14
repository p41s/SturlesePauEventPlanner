import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.ArrayList;


public class SturlesePauMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        //Creamos la lista para almacenar los eventos
        ArrayList<SturlesePauEvent> eventos = new ArrayList<>();

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


                //Solicitar titulo del evento obligatoriamente (no puede estar vacio)
                String title;
                while (true) {
                    System.out.print("\nIntroduce el titulo del evento:");
                    title = scanner.nextLine();

                    //verificar que no este vacio
                    if (!title.isEmpty()) {
                        break;
                    } else {
                        System.out.println("El titulo no puede estar vacio");
                    }
                }

                //Fecha del evento. Realizamos una entrada en string, convertimos a LocalDate si es posible.
                LocalDate date = null;
                while (date == null) {
                    System.out.print("\nIntroduce la fecha del evento (yyyy-MM-dd):\n");
                    String dateString = scanner.nextLine();

                    try{
                        //Intentamos convertir el String a LocalDate
                        date = LocalDate.parse(dateString);
                        System.out.println("Fecha validada: " + date);
                    } catch (DateTimeParseException exception){
                        System.out.println("Fecha no valida. Usa el formato correcto,por ejemplo (2024-01-02)");
                    }
                }


                //Prioridad del evento Creamos un bucle para obtener un input valido
                int priorityOption;
                while (true) {
                    System.out.print("\nIntroduce la prioridad del evento:\n 1.Alta | 2.Media | 3.Baja\n");
                    //Verificamos que sea un numero entero
                    if (scanner.hasNextInt()) {
                        priorityOption = scanner.nextInt();
                        scanner.nextLine();

                        // Verificamos que sea 1 2 o 3
                        if (priorityOption == 1 || priorityOption == 2 || priorityOption == 3) {
                            break;

                        } else {
                            System.out.println("Opcion no valida. Introduce una valor valido");
                        }
                    } else {
                        System.out.println("Opcion no valida. Introduce una valor valido");
                        scanner.nextLine();
                    }
                }

                //Asignamos prioridad segun el valor proporcionado por el usuario
                Priority priority;
                if (priorityOption == 1) {
                    priority = Priority.HIGH;
                } else if (priorityOption == 2) {
                    priority = Priority.MEDIUM;
                } else {
                    priority = Priority.LOW;
                }

                //Creamos el evento con los datos introducidos
                SturlesePauEvent nuevoEvento = new SturlesePauEvent(title, date, priority);

                //Añadimos nuestro evento a nuestra lista
                eventos.add(nuevoEvento);
                System.out.println("Evento añadido!");

                break;

            case 2:
                 System.out.println("[2] Borrar evento");
                 break;

            case 3:
                 System.out.println("[3] Listar eventos");
                 if (eventos.isEmpty()){
                     System.out.println("\nNo hay eventos disponibles.");
                 } else {
                     System.out.println("Lista de eventos:");
                     for (SturlesePauEvent evento : eventos){
                         System.out.println(evento);
                     }
                 }

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

        scanner.close();
    }
}



