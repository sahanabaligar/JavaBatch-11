package com.basics;
class Code {
	@Override 
	public String toString() {
		return "custom created obj";
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		Code ob = new Code ();
		System.out.println(ob);
		Code obj1 = new Code();
		System.out.println(obj1);
		 
		Code obj2 = obj1;
		if(obj1== ob) {
			System.out.println(" same");
			
		}
		else {
			System.out.println("different" );
		}
		 System.out.println(ob.hashCode());
		
	}
	
}
