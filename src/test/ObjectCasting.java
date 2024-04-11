package test;

class Parent
{
	String s1 = "Annu";
	void m1()
	{
		System.out.println("m1 from Parent....");
	}
}

class Child extends Parent
{
	int id = 101;
	void m2()
	{
		System.out.println("m2 from Child....");
	}
}

public class ObjectCasting 
{

	public static void main(String[] args) 
	{
		/*Child c = new Child();
		System.out.println(c.s1); 
		System.out.println(c.id);
		c.m1();
		c.m2();
		*/
		Parent p = new Parent();
		Child c1 = (Child) p;
		System.out.println(c1.s1);
		System.out.println(c1.id);
		c1.m1();
		c1.m2();

		Child c = (Child) new Parent();
	}
	

}
