package oops;

public class RunnerClass 
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.Name = "Antra";
		emp1.EmpId = 101;
		//emp1.sal; can't use in any other class bcz it's private in Employee class
		//emp2.sal; can't use in any other class bcz it's private in Employee class
		emp1.setSalary(400000);
		
		
		Employee emp2 = new Employee();
		emp2.Name = "Shritik";
		emp2.EmpId = 102;
		emp2.setSalary(500000);
		
		emp1.display();
		emp2.display();
		
		
		System.out.println("Parameterized CVonstructor: ");
		
		Employee emp3 = new Employee("Krunal", 103, 1000000);
		emp3.display();
		
		ICICIBank  objic = new ICICIBank();
		objic.AccNo=12345;
		objic.BankId=1001;
		
		HDFCBank objhdfc = new HDFCBank();
		objhdfc.Account=1200010000;
		objhdfc.BankId=1002;
		
		//Bank objb = new ICICIBank();
		//only bank variables we can use
		
		System.out.println(objic.AccNo);
		System.out.println(objic.BankId);
		
		System.out.println(objhdfc.Account);
		System.out.println(objhdfc.BankId);
		
	}

}
