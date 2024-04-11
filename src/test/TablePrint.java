package test;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		
		
		for(int i=1; i<=10; i++)
		{
			int result = num * i;
			System.out.println(num+ "*" +i+ "="+result );
		}
	}

}
