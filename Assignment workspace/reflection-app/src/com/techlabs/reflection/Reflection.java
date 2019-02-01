package com.techlabs.reflection;

public class Reflection {

	private String name;
	private int age;

	public Reflection(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private void method1() {
		System.out.println("Method 1 is called");
	}

	private void method2() {
		System.out.println("Mehtod 2 is called");
	}

}
