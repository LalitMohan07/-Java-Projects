package com.training.day10.java8features;

public class Student {
	private int studentid;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	private String studentname;
	private Double score;
	public Student() {
		
	}
	public Student(int stdid,String stdname,Double i) {
		this.studentid=stdid;
		this.studentname=stdname;
		this.score=i;
	}
}
