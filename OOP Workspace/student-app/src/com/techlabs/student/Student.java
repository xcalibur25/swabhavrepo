package com.techlabs.student;

public class Student {

	private final String name;

	private final int rollno;
	private int age;
	private static int count;
	public Student(String name, int rollno, int age) {
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.count++;
		System.out.println("Constructor is called");
		
		
	}

	public Student(int rollno, String name) {
		this(name, rollno, 18);
	}
	static { 
        count = 100; 
        System.out.println("static block called "); 
    } 
	
	public static int  headCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public int getAge() {
		return age;
	}
	public int getCount() {
		return count;
	}

	public Student whoIsElder(Student secondStudent) {
		if (this.age > secondStudent.age)
			return this;
		return secondStudent;
	}

}
