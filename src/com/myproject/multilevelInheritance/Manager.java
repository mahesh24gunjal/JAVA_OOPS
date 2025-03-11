package com.myproject.multilevelInheritance;

public class Manager extends CEO {
	
	String department="Software developement and Application support";
	
	  void manageProjects() {
	        System.out.println("Manager: Managing projects in " + department + " department.");
	    }

}
