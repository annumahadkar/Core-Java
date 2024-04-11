package test;

public class LoopingExample 
{

	public static void main(String[] args) 
	{
		//print all the numbers from 1 to 10
		int num=1;
		
		System.out.println("Numbers from 1 to 10 using for loop...........");
		for(num=1; num<=10; num++)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Numbers from 1 to 10 using while loop...........");
		
		num=1;
		while(num<=10)
		{
			System.out.print(num+" ");
			num++;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Numbers from 1 to 10 in descending order using do while loop...........");
		num=10;
		do
		{
			System.out.print(num+ " ");
			num--;
		}while(num>=0);
		
		

		System.out.println();
		System.out.println();
		
		System.out.println("Numbers from 1 to 20, print even numbers ...........");
		
		num = 1;
		for(num=2; num<=20; num+=2)
		{
			System.out.print(num+" ");
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Numbers from 1 to 20, print odd numbers ...........");
		
		num = 1;
		for(num=1; num<=20; num+=2)
		{
			System.out.print(num+" ");
		}
		
		num=1;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Sum of numbers from 1 to 10................");
		int sum = 0;
		for(num=1; num<=10; num++)
		{
			sum=sum+num;
		}
		System.out.println("Sum = "+sum);
	
		
		System.out.println();
		System.out.println();
		
		System.out.println("Sum of numbers from 1 to 10 using for each loop................");
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		sum = 0;
		for(int value:a)
		{
			System.out.println(value);
			sum=sum+value;
		}
		System.out.println("Sum = "+sum);
	
	}

}
