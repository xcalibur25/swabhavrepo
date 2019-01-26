package com.techlabs.person;

public class Person {

	private final String name;
	private final int age;
	private  GenderType gender;
	private float weight;
	private float height;

	public Person(String name, int age, GenderType gender, float weight, float height) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public Person(String name, int age, GenderType gender) {
		this(name, age, gender, 60.1f, 5.5f);

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGenderType() {
		return gender;
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}

	public void doWorkOut() {
		this.weight = weight - ((2 / weight) * 100);
	}

	public void eat() {
		this.weight = weight + ((5 / weight) * 100);
		this.height = height + ((1 / weight) * 100);
	}

	public float calculateBMI() {
		float bmi = (this.weight) / (this.height * this.height);
		return bmi;
		
	}

	public String bmiCategory() {
		float bmi;
		bmi= calculateBMI();
		if (bmi < 18.5)
			return "underweight";
		if (bmi >= 18.5 && bmi <24.9)
			return "normal weight";
		
		if (bmi >= 24.9 && bmi <29.9)
			return "overweight";
		
		if (bmi >= 29.9 && bmi <39.9)
			return "class 1  obesity";
		
		if (bmi >= 34.9  && bmi <49.9)
			return "class 2  obesity";
		return "class 3  obesity";
		
	}

}
