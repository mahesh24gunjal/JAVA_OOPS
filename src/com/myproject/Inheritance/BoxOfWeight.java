package com.myproject.Inheritance;

public class BoxOfWeight extends Box{
	
	double weight;
	
	public BoxOfWeight()
	{
		this.weight=-1;
		
	}

	BoxOfWeight(double l,double h,double w,double weight) {
		super(l,h,w);//what is this?
		//call the parent class constructor
		
		this.weight=weight;
	}
	
	

}
