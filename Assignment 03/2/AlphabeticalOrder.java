/*
 ------------------------------------------------------------------------------------
 *Write a program which will read a string and rewrite it in the alphabetical order. 
 *For example, the word STRING should be written as GINRST.
 ------------------------------------------------------------------------------------
 */
import java.util.*;

class AlphabeticalOrder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word");

		String inputString = sc.next();

	
		// convert input string to Character array 
		Character tempArray[] = new Character[inputString.length()]; 
		for (int i = 0; i < inputString.length(); i++) { 
			tempArray[i] = inputString.charAt(i); 
		} 
	

		// Sort, ignoring case during sorting 
		Arrays.sort(tempArray, new Comparator<Character>(){ 
	
			public int compare(Character c1, Character c2) 
			{ 
				// ignoring case 
				return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2)); 
			} 
		}); 

		 // using StringBuilder to convert Character array to String 
		 StringBuilder sb = new StringBuilder(tempArray.length); 
		 for (Character c : tempArray) 
			 sb.append(c.charValue()); 
			
		 System.out.println(sb.toString());
		
	}
}