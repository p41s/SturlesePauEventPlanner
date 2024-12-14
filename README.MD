## README

Proyecto  M03-UF2 - Creacioón de un Event Planner

En este proyecto se creara un planificador de eventos.
Se permitira a los usuarios registrar nuevos eventos, supervisar tareas en cada uno de ellos, y asegurarse de que topdo se ejecute segun lo planeado.

La aplicación tendra un menú desde donde se podran realizar las siguientes opciones:

[1] Añadir evento: permite al usuario introducir obligatoriamente sus datos básicos (title, date, priority).
Opcionalmente permítele introducir las tareas del evento. Cuando haya acabado regresa al menú


[2] Borrar evento: permite al usuario introducir el title del evento. Por simplicidad supón que para poder
borrar un evento el texto introducido por el usuario debe coincidir exactamente con el titulo de uno de los
eventos. Confirma al usuario si la acción ha podido realizarse. Regresa al menú.

[3] Listar eventos: muestra los eventos registrados

[4] Marcar/desmarcar tarea de un evento como completada: permite al usuario introducir el title del
evento sobre el que interactuar. Por simplicidad supón que el texto introducido por el usuario debe
coincidir exactamente con el titulo de uno de los eventos. Si el titulo del evento existe, lista sus tareas
y el usuario indica la tarea sobre la que quiere interactuar. Informa
al usuario de la acción realizada. Regresa al menú

[5] Salir: se terminará el programa