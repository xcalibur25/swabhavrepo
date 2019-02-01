package com.techlabs.reflection.test;

import com.techlabs.reflection.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class TestReflection {

	public static void main(String[] args) throws Exception {
		Reflection r = new Reflection("Yash", 21);

		int mcount = 0, constcount = 0;
		try {
			Class cls = Class.forName("com.techlabs.reflection.Reflection");
			Method methlist[] = cls.getDeclaredMethods();
			for (int i = 0; i < methlist.length; i++) {
				Method m = methlist[i];
				mcount = mcount + 1;
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("The number of methods are " + mcount);
		try {
			Class cls = Class.forName("com.techlabs.reflection.Reflection");
			Constructor constlist[] = cls.getDeclaredConstructors();
			for (int i = 0; i < constlist.length; i++) {
				Constructor c = constlist[i];
				constcount = constcount + 1;
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("The number of constructors are " + constcount);

	}

}
