package com.indra.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {

	public static void main(String[] args) {
		System.out.println("Bienvenido al gestor de tareas.");

		ToDo task;
		List<ToDo> tasks = new ArrayList<ToDo>();

		do {
			task = askForToDo("X");
			if (null != task)
				tasks.add(task);

		} while (null != task);
		System.out
				.println("Se ha finalizado la introduccion de tareas, estas son las tareas creadas:");

		Iterator<ToDo> it = tasks.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * Metodo para solicitar un parametro al usuario
	 * 
	 * @param message
	 *            Mensaje de solicitud al usuario
	 * @return El valor introducido por el usuario
	 */
	public static String askFor(String message) {
		System.out.print("\n" + message + ": ");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();

		return value;
	}

	/**
	 * Metodo para solicitar al usuario los datos de una tarea
	 * 
	 * @param escape
	 *            String a introducir por el usuario para finalizar la
	 *            introduccion de datos
	 * @return La tarea definida, o null si el usuario ha cancelado la
	 *         introduccion
	 */
	public static ToDo askForToDo(String escape) {
		ToDo task = null;
		String desc;

		desc = askFor("Introduzca la descripcion de la tarea (Introduzca "
				+ escape + " para salir)");
		if (desc.equals(escape))
			return null;

		task = new ToDo(desc);
		return task;
	}
}
