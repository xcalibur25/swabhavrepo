package com.techlabs.arg;

public class TestParameter {

	public static void main(String[] args) {
		int no = 10;
		 changeToZero(no);

		System.out.println(no);

		int[] nos = { 10, 20, 30 };
		 changeToZero(nos);

		for (int n : nos) {
			System.out.print(n + " ");
		}

	}

	

	public static void changeToZero(int num) {
		num = 0;
		
	}

	public static  void changeToZero(int[] number) {
		for (int i = 0; i < number.length; i++) {
			number[i] = 0;
		}
		
	}

}
