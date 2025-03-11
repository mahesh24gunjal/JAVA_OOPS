package com.myproject.multilevelInheritance;

public class Employee extends Manager{
	
	String name;
	
	Employee(String name)
	{
		this.name=name;
		
	}

	
	void work(){
 
		System.out.println(name + ": Working on software development tasks.");
	}
	
	
}
