package Inheritence;

public class  ChildClass extends ParentClass {
	
	public void  m2() {
		System.out.println("m2 method of child class");
		
	}
	
	public ChildClass () 
	{
		super(90);
		//System.out.println(i);
		System.out.println("const of child class");
	}
	
	public static void d1() {
		System.out.println("static method of child class");
	}
	public static void main(String[] args) {
		
		ChildClass s= new ChildClass();
		//s.Home();
		s.m2();
		d1();

	}

}
