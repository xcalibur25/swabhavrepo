package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle();
		rect.setWidth(20);
		rect.setHeight(40);
		int area = rect.calculateArea();
		System.out.println("Width is: " + rect.getWidth());
		System.out.println("Height is:" + rect.getHeight());
		System.out.println("Area is:" + area);

		Rectangle r1 = new Rectangle();
		r1.setWidth(100);
		r1.setHeight(20);
		printDetails(r1);

		Rectangle r2 = new Rectangle();
		r2.setWidth(50);
		r2.setHeight(70);
		printDetails(r2);

		Rectangle r3 = r1;
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		r3.setHeight(2);
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		
		//r3=null;
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		
		System.out.println(new Rectangle().calculateArea());
		printDetails(new Rectangle());
	}

	public static void printDetails(Rectangle r) {
		System.out.println("Width is:" + r.getWidth());
		System.out.println("Height is:" + r.getHeight());
	}
}
