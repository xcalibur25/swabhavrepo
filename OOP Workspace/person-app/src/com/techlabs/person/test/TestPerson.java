package com.techlabs.person.test;

import com.techlabs.person.*;
import com.techlabs.person.GenderType;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Yash", 18, GenderType.MALE, 55.5f, 6.1f);
		Person p2 = new Person("Sayali", 21, GenderType.FEMALE);
		p1.doWorkOut();
		p1.eat();
		printDetails(p1);
		System.out.println("BMI is"+ p1.calculateBMI());
		System.out.println("BMI category "+ p1.bmiCategory());
		System.out.println("\n");
		p2.doWorkOut();
		p2.eat();
		printDetails(p2);
		System.out.println("BMI is"+ p2.calculateBMI());
		System.out.println("BMI category "+ p2.bmiCategory());
	}

	public static void printDetails(Person p) {
		System.out.println("Name :" + p.getName());
		System.out.println("Age :" + p.getAge());
		System.out.println("Gender :" + p.getGenderType());
		System.out.println("Weight :" + p.getWeight());
		System.out.println("Height :" + p.getHeight());
	
	}

}
