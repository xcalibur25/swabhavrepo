package com.techlabs.overloading;

public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		printThis(10);
		printThis(22.55);
		printThis(10.1f);
		printThis(true);
		printThis("Hello");
	}

	
	public static void printThis(int a) {
		System.out.println(a);
		System.out.println("Overload 1");
	}

	public static void printThis(double a) {
		System.out.println(a);
		System.out.println("Overload 2");
	}
	
	public static void printThis(float a) {
		System.out.println(a);
		System.out.println("Overload 3");
	}
	
	public static void printThis(String a) {
		System.out.println(a);
		System.out.println("Overload 4");
	}
	
	public static void printThis(boolean a) {
		System.out.println(a);
		System.out.println("Overload 5");
	}
	
	
}
