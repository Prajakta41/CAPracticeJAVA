package AccessModifiers;

import accessmodifierProtected.A;

public class ProtectedA extends A {
	
	public static void main(String[] args) {
		
		A a = new A();
	//	a.m1(); //can not call ref of Class A 
		
		ProtectedA a1 = new ProtectedA();
		
		a1.m1();  // called only with ref of child class ref.
		
	}

}
