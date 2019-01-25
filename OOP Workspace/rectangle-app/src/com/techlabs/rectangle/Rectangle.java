package com.techlabs.rectangle;

public class Rectangle {

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int calculateArea() {
		int area = this.height * this.width;
		return area;
	}

	public void setWidth(int width) {
		this.width = validateDimension(width);

	}

	public void setHeight(int height) {
		this.height = validateDimension(height);
	}

	private int validateDimension(int dimensions) {
		
		if (dimensions < 0) {
			return 1;
		}
		if (dimensions > 100) {
			return 100;
		}
		return dimensions;
	}

}
