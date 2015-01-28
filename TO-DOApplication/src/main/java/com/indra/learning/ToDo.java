package com.indra.learning;

import java.util.Date;

/**
 * Clase que representa una tarea a realizar.
 * 
 * @author ealcalal
 *
 */
public class ToDo {
	private String taskDescription;
	private boolean completed;
	private Date creationDate;
	private Date finished;

	/**
	 * Constructor principal.
	 * 
	 * @param task
	 *            Descripcion de la tarea
	 * @param completed
	 *            Indicador de finalización de la tarea
	 * @param added
	 *            Fecha de creacion de la tarea
	 */
	public ToDo(String taskDescription, boolean completed, Date creationDate) {
		this.taskDescription = taskDescription;
		this.completed = completed;
		this.creationDate = creationDate;
	}

	/**
	 * Constructor simplificado. La fecha de creación de la tarea se establece
	 * desde la fecha del sistema. Por defecto se indica como no finalizada
	 * 
	 * @param task
	 *            Descripcion de la tarea
	 */
	public ToDo(String taskDescription) {
		this.taskDescription = taskDescription;
		this.creationDate = new Date();
		this.completed = false;
	}

	@Override
	public String toString() {
		return creationDate + ": " + this.getTaskDescription();
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getFinished() {
		return finished;
	}

	public void setFinished(Date finished) {
		this.finished = finished;
	}
}
