package com.training.task;

public class Taskservice {
	private Taskdao taskdao;
	public Taskservice() {
		taskdao = new Taskdao();
	}
	public void insertTaskDetails() {
		taskdao.insert();
	}
	public void deleteTaskDetails() {
		taskdao.delete();
	}public void updateTaskDetails() {
		taskdao.update();
	}public void viewTaskDetails() {
		taskdao.view();
	}
}
