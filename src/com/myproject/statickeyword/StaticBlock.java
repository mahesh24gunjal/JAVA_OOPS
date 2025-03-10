package com.myproject.statickeyword;

public class StaticBlock {
	
	static int a=4;
	static int b;
	
	//will only runs one when the first obj is created i.e when the class is loaded for 
	static {
		System.out.println("I am in static block");
		b=a*5;
	}
	
	public static void main(String str[])
	{
		StaticBlock obj=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		StaticBlock.b+=3;
		
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		StaticBlock obj2=new StaticBlock();
		
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
	}

}
