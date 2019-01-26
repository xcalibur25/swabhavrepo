package com.techlabs.codemagnet.chapter1;

public class Sum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 0;
		while (x < 5) {
			y=x-y;
			System.out.print(x + "" + y + " ");
			x = x + 1;

		}

	}
}
