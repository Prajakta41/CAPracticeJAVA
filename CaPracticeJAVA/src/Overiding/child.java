package Overiding;

public class child extends Parent{
	
	public void m1() {
		System.out.println("m1 method of child class overridden");
	}
	
	

	public void home() {
		System.out.println("home method of child class");
	}
	public static void  m2() {
		System.out.println("static method of child");
	}
	public static void main(String[] args) {
		
		Parent pp = new child();
		
		pp.m1();
		
		pp.bike();
		
		pp.m1(20);
		
		Parent.car();
		m2();
		child d= new child();
		d.home();
		
	}

}
