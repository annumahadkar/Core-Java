package oops;

public class Employee 
{
	public String Name;
	public int EmpId;
	private int Sal;
	
	public void display()
	{
		System.out.println("Name is " +Name);
		System.out.println("Id is " +EmpId);
		System.out.println("Salary is "+Sal);
	}

	public void setSalary(int sal)
	{
		Sal = sal;
	}
	
	public Employee()
	{
		System.out.println("Default Constructor: ");
	}
	
	
	public Employee(String n, int id, int salary)
	{
		this.Name = n;
		this.EmpId = id;
		this.Sal = salary;
	}
	
}
