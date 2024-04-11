package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Item1", 100);
		hm.put("Item2", 200);
		hm.put("Item3", 100); //Value can be duplicated,not the key. It will display only unique key with the latest value
		hm.put("Item4", 50);
		hm.put("Item1", null); //this will be printed as the latest value for Item1
		hm.put("Item5", null); //won't displayed as only single null is allowed
		
		System.out.println(hm);
		
		System.out.println(hm.get("Item2"));
		System.out.println(hm.values());
		
		System.out.println(hm.remove("Item1"));
		System.out.println(hm);
		
		System.out.println();
		
		//iterate through map
		/*for(int value:hm.values())
		{
			System.out.println("The value is "+value);
		}*/
		
		for(String key:hm.keySet())
		{
			System.out.println("The key is "+key);
			System.out.println("The value is "+hm.get(key));
			System.out.println();
		}
		
		System.out.println(hm.size());
	}
	

}
