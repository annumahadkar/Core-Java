package test;

import java.util.Scanner;

public class ReversedNumber 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		int reversed_num = 0;
		int sum_of_digits = 0;
		
		for(int i=num; i>0; i /= 10)
		{
			int remainder = i%10;
			
			reversed_num = reversed_num * 10 + remainder;
			
			sum_of_digits += remainder;
		}
		
		System.out.println("Reversed : " +reversed_num);
		System.out.println("Sum : "+sum_of_digits);

	}

}
