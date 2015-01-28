package com.indra.learning;

import java.util.Date;

public class ToDoTest {

	public static void main(String[] args) {
		ToDoTest.test();
	}

	public static void test() {
		Date creationDate = new Date();
		String taskDesc = "Descripcion de la tarea";

		ToDo task = new ToDo(taskDesc, false, creationDate);

		// Comprobamos que la gestion de la descripcion de la tarea es correcta
		if (!task.getTaskDescription().equals(taskDesc)) {
			throw new RuntimeException(
					"Error al establecer la descripcion de la tarea");
		}

		// Comprobamos que la gestion de la descripcion de la tarea es correcta
		if (!task.getCreationDate().equals(creationDate)) {
			throw new RuntimeException(
					"Error al establecer la fecha de la tarea");
		}
		// Comprobamos que la gestion de la finalizacion de la tarea es correcta
		if (task.isCompleted()) {
			throw new RuntimeException(
					"Error al establecer la finalizacion de la tarea");
		}

		System.out.println(task);
	}
}
