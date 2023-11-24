package com.training.task;

public class Task {
	private int task_id;
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_title() {
		return task_title;
	}
	public void setTask_title(String task_title) {
		this.task_title = task_title;
	}
	public String getTask_text() {
		return task_text;
	}
	public void setTask_text(String task_text) {
		this.task_text = task_text;
	}
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	private String task_title;
	private String task_text;
	private String assigned_to;
}
