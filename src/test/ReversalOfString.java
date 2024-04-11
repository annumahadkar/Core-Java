package test;

import java.util.Scanner;

public class ReversalOfString 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = scn.nextLine();
		
		String reversed_string="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed_string = reversed_string+ str.charAt(i);
		}
		
		System.out.println("Reversed String : "+reversed_string);
		
	}

}
