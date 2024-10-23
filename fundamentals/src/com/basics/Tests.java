package com.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Hello{
	int data =100;
	static int data2=200;
	public static void getName() {
		 System.out.print("hello class");
		 
	}
	public static void getData() {
		System.out.print("hello class");
		
	}
	
}

public class Tests {

	public static void main(String[] args) {
		Hello h = new Hello();
		 Hello h2 = new Hello();
		 Class obj =h.getClass();
		 System.out.print("obj");
		 
		 Method[] methods =obj.getDeclaredMethods();
		 for(Method method : methods) {
			 System.out.println(method.getName());
			 
		 }
		Field[] fields =obj.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
	 
}
}


	