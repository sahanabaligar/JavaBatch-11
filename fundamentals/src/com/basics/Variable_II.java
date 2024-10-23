package com.basics;

class Vehicle{
	static String companyName = "TataMotors";
}

public class Variable_II {
	public static void main(String[] args) {
		// ClassNmae.varName
		System.out.println(Vehicle.companyName);
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		
		System.out.println(v1.companyName);
		System.out.println(v2.companyName);
		
		System.out.println("____________");
		System.out.println("After modification");
		
		v1.companyName ="Mahindra Groups";
		
		System.out.println(v1.companyName);
		System.out.println(v2.companyName);
		
		
	
	}
	

}

