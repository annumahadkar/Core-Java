package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Object> list1 = new ArrayList<Object>();
		
		list1.add("Krunal");
		list1.add("Annu");
		list1.add(100);
		list1.add('A');
		list1.add(100.20);
		list1.add(null);
		list1.add(null);
		list1.add("Annu");
		
		System.out.println(list1);
		System.out.println(list1.get(2));
		System.out.println(list1.remove(list1.size()-1));
		System.out.println(list1);
		list1.add(1,"Patel");
		list1.set(1,"Shritik");
		
		System.out.println(list1);
		
		System.out.println(list1.remove(list1.size()-1));
		
		System.out.println(list1.size());
		
		for(int i =0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
		//advanced for each loop
		for(Object x: list1)
		{
			System.out.println(x);
		}
		
		//using Iterator
		
		System.out.println();

		
		Iterator it = list1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		try
		{
		System.out.println(it.next());
		}
		catch(NoSuchElementException e)
		{
			
		}
		finally
		{
			ArrayList<Object> list2 = new ArrayList<Object>();
			list2.add(100);
			list2.add('A');
			list2.add(100.2);
			list2.add(null);
			System.out.println(list1.isEmpty());
			list1.removeAll(list2);
			
			System.out.println(list1);
		}
		
	}

}
