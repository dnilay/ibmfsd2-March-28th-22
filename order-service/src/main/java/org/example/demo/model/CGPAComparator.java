package org.example.demo.model;

import java.util.Comparator;

public class CGPAComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Student student = (Student) arg0;
		Student student2=(Student)arg1;
		if (student.getCGPA() > student2.getCGPA()) {
			return -1;
		}
		else if (student.getCGPA() < student2.getCGPA()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
