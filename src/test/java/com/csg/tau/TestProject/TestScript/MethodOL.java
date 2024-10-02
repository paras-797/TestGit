package com.csg.tau.TestProject.TestScript;

public class MethodOL {
	@BeforeSuite
	public void sum(int a, int b) {
		int z=a+b;
		System.out.println("Sum of numbers is "+z);
	}
	
	@BeforeTest
	public void sum(double a, int b) {
		double z=a+b;
		System.out.println("Sum of numbers is "+z);
	}
	
	@BeforeClass
	public void sum(int a, double b) {
		double z=a+b;
		System.out.println("Sum of numbers is "+z);
	}

	@beforeMethod
	public void sum(int a, int b, int c) {
		int z=a+b+c;
		System.out.println("Sum of numbers is "+z);
	}
	@Test
	public void sum(int a, int b, int c, int d) {
		int z=a+b+c+d;
		System.out.println("Sum of numbers is "+z);
	}




	public static void main(String[] args) {
		MethodOL obj=new MethodOL();
		obj.sum(10,20);
		obj.sum(10, 20,30);
		obj.sum(10, 20,30,40);
		obj.sum(10.5, 20);
		obj.sum(10, 20.5);

	}
}
