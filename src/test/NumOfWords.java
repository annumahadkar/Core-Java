package test;

import java.util.Scanner;

public class NumOfWords 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1 = scn.nextLine();
		
		int count =1;
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("Total num of words are " +count);

		System.out.println("Enter a string: ");
		str1 = scn.nextLine();
		
		System.out.println("Total num of words are " + str1.split(" ").length);

		
	}

}
