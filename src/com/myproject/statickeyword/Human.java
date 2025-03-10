package com.myproject.statickeyword;

public class Human {
	
	int age;
	String name;
	int salary;
	boolean married;
	static long population;
	
	
	static void message()
	{
		System.out.println("Hello Message");
		//System.out.println(this.name);//you cannt used this inside the static method
		
	}
	
	//create a constructor
	public Human(int age, String name, int salary, boolean married) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		Human.population=+1;
	}
	
	
	
	
	
	
	

}
