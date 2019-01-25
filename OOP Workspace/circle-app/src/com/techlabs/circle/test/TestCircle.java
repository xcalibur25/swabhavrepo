package com.techlabs.circle.test;

import com.techlabs.circle.*;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setRadius(0.0f);
		float area = c.calculateRadius();
		System.out.println("Radius is " + c.getRadius());
		System.out.println("Area is " + area);
		c.setBackgroundColor("red");
		System.out.println("Background color is " + c.getBackgroundcolor());

	}

}
