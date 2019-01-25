package com.techlabs.circle.test;
import com.techlabs.circle.*;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c= new Circle();
		c.setRadius(0.1f);
		c.setBackgroundColor(ColorOptions.GREEN);
		System.out.println(c.getRadius());
		System.out.println(c.getBackgroundcolor());
		System.out.println(c.calculateRadius());

	}

}
