package com.techlabs.circle;

public class Circle {
	private float radius;
	private static float PI =  3.142f;
	private String backgroundColor;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = checkRadius(radius);
	}

	public float calculateRadius() {
		float area = PI * this.radius * this.radius;
		return area;
	}

	public String getBackgroundcolor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundcolor) {
		this.backgroundColor = checkBackgroundColor(backgroundcolor);
	}

	private float checkRadius(float dimensions) {
		if (dimensions < 0.1) {
			return (float) 0.1;
		}
		if (dimensions > 0.9) {
			return (float) 0.9;
		}
		return dimensions;
	}

	private String checkBackgroundColor(String backgroundcolor) 
	{
		if (backgroundcolor.equalsIgnoreCase("Blue") 
			|| backgroundcolor.equalsIgnoreCase("Green") ||
			backgroundcolor.equalsIgnoreCase("Red"))
		{
			return backgroundcolor;
		}
		else
			return "Blue";

	}

}
