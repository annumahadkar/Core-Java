package test;

import java.util.Scanner;

public class Calculator {

	int sum(int a, int b)
	{
		return a+b;
	}
	
	int sub(int x, int y)
	{
		return x-y;
	}
	
	int mul(int a, int b)
	{
		return a*b;
	}
	
	double div(int a, int b)
	{
		return a/b;
	}
	
	int mod(int a, int b)
	{
		return a%b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of A : ");
		int a = scn.nextInt();
		
		System.out.println("Enter value of B : ");
		int b = scn.nextInt();
		
		int c = calc.sum(a,b);
		System.out.println("Addition of a & b is : "+c);
		
		System.out.println("Subtraction of a & b is : "+calc.sub(a,b));
		
		System.out.println("Multiplication of a & b is : "+calc.mul(a,b));
		
		System.out.println("Division of a & b is : "+calc.div(a, b));
		
		System.out.println("Mod of a & b is : "+calc.mod(a, b));
	}
}
