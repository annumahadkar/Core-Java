package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		String[] a = {"abc","xyz","qwe"};
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		//adding data to the array list
		mylist.add("Annu");
		mylist.add("Vini");
		mylist.add("Swatu");
		
		//printing size of the array list
		System.out.println("Size of the list: "+mylist.size());
		
		//removing the data from array list
		mylist.remove(2);
		System.out.println("After removing: "+mylist);
		
		
		mylist.add("Swati");
		System.out.println("After adding: "+mylist);
		
		System.out.println(mylist.remove(0));
		System.out.println("After adding: "+mylist);
		
		mylist.add("Bhumika");
		
		//access the data at 2nd position
		System.out.println(mylist.get(2));
		
		mylist.set(0, "Raksha");
		System.out.println(mylist);
		
		
		//Iterate through the list
		for(int i=0; i<mylist.size(); i++)
		{
			//System.out.println("Value at index "+i+" "+mylist.get(i));
			
			if(mylist.get(i).equals("Swati"))
			{
				System.out.println("Value Swati is at index "+i);
			}
		}
		
		mylist.add("Antra");
		mylist.add("Vinita");
		//sort the data
		Collections.sort(mylist); //ascending
		System.out.println(mylist);
		
		//sorting of the data in the descending order
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println(mylist);
	}

}
