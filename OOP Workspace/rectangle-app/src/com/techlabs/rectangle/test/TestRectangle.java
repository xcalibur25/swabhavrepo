package com.techlabs.rectangle.test;
import com.techlabs.rectangle.*;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle();
		rect.setWidth(-1);
		rect.setHeight(-1);
		int area= rect.calculateArea();
		System.out.println("Width is: " + rect.getWidth());
		System.out.println("Height is:"+rect.getHeight());
		System.out.println("Area is:"+ area);
		

	}

}
