package com.myproject.statickeyword;

public class Main {

	public static void main(String[] args) {
//		Human kunal=new Human(24,"Mahesh Gunjal",10000,false);
//		Human huzefa=new Human(23,"Huzefa Shaikh",90000,false);
//		Human shubham=new Human(23,"shubham gavhane",80000,true);

		
		//static variable we can use using of reference varibale name also and 
        //also using of Class name also but we preffered always using of class name
		

		System.out.println(	Human.population);
		Human.message();
		
	}
		
		//static is not dependent on object they belong to class
		static void fun()
		{
			//ant use this because it requires an instance
			//but the function you are using it is does not depend on instance
			
			
			//you cannt access non static stuff without referencing their instance in a static member
			//hence, I am referencing it
			
			Main obj = new Main();
			obj.greeting();
			
			
		}
		
		void greeting()//for object is needed
		{
			//fun();
			System.out.println("Hello world");
		}
		

}
