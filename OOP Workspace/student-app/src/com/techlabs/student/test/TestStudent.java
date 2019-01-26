package com.techlabs.student.test;

import com.techlabs.student.*;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Yash", 22, 20);
		getDetails(s1);
		Student s2 = new Student(21, "Nimish");
		getDetails(s2);

		Student elder = s1.whoIsElder(s2);
		getDetails(elder);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(elder.hashCode());
	}

	public static void getDetails(Student p) {
		System.out.println("Name is " + p.getName());
		System.out.println("RollNo is " + p.getRollno());
		System.out.println("Age is " + p.getAge());
	}

}
