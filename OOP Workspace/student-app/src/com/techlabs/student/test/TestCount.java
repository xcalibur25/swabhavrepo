package com.techlabs.student.test;
import com.techlabs.student.*;
public class TestCount {

	public static void main(String[] args) {
		Student s1 = new Student("Yash", 21, 40);
		System.out.println(s1.getCount());
		Student s2 = new Student("Abc",22,41);
		System.out.println(s1.getCount());
		Student s3 = new Student("Xyz", 23, 44);
		System.out.println(s1.getCount());
		System.out.println(Student.headCount());
		
	}

}
