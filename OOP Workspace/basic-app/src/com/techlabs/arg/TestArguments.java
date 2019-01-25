package com.techlabs.arg;

public class TestArguments {

	public static void main(String[] args)
	{
		// System.out.println(args.length);

		if (args.length == 0) 
		{
			System.out.println("Please enter some value\n" + "Thankyou");
		}

		for (int i = 0; i < args.length; i++) 
		{
			System.out.println("Hello " + args[i]);

		}
		System.out.println("ThankYou");

	}

}
