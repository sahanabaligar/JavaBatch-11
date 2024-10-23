package com.basics;

class Student{
	int studentId = 101; // Instance variable

	@Override
	public String toString() {
		return " "+ studentId;
	}
	
}

public class Variable_1 {

	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student();
//		System.out.println(s.studentId);
//		System.out.println(s2.studentId);
		
		System.out.println("___________");
		
		s.studentId =500;
		System.out.println(s.studentId);
		System.out.println(s2.studentId);
		
		
	}

}
