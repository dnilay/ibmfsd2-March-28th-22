package org.example.demo.model;

public class Student implements Comparable {

	private int studentId;
	private String studentName;
	private double CGPA;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, double cGPA) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		CGPA = cGPA;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", CGPA=" + CGPA + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		if (this.getCGPA() > student.getCGPA()) {
			return -1;
		}
		else if (this.getCGPA() < student.getCGPA()) {
			return 1;
		}
		else {
			return 0;
		}
		

	}

}
