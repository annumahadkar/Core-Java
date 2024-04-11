package test;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean India Green India";
		
		System.out.println("Total no. of characters are : "+str1.length());
		
		System.out.println("First character is : "+str1.charAt(0));
		
		System.out.println("Last character is : "+str1.charAt(str1.length()-1));
		
		System.out.println("The UpperCase string is : "+str1.toUpperCase());
		
		System.out.println("The LowerCase string is : "+str1.toLowerCase());
		
		System.out.println(str1.substring(0, 11));
		
		System.out.println(str1.replace('C', 'A'));
		
		System.out.println(str1.replace("Alean", "Clean"));
		
		
	}

}
