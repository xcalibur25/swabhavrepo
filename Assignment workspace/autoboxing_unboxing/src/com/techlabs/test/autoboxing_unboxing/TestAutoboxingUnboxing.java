package com.techlabs.test.autoboxing_unboxing;

import java.util.ArrayList;

public class TestAutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			myIntArrayList.add(i + 1);
		}

		for (int i = 0; i < myIntArrayList.size(); i++) {
			int value = myIntArrayList.get(i);
			System.out.println(i + "->" + value);
		}

	}

}
