package com.shahbaz.corejava.chapterone;

class A{
	
	A(){
		System.out.println("Parent ");
	}
}
class B extends A{
	
}


public class ConstuctorProblem {

	public static void main(String[] args) {
	
		B b=new B();
	}

	
}
