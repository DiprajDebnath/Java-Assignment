/*Write a program to find the length of the longest consecutive element sequence from a given unsorted array of integers. 
Sample Array: [49, 1, 3, 200, 2, 4, 70, 5] 
The longest consecutive element sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
*/

import java.util.*;

public class ConsecutiveSequence {

	//method for finding longest consecutive sequence
	static int sequenceLength(int arr[], int size)
	{
		Vector vector = new Vector();
		int length = 0; 


		for(int i = 0; i < size; i++) vector.addElement(arr[i]);

		for(int i = 0; i < size; i++)
		{
			int num = arr[i];
			int count = 1; //since length is at least 1
			
			int low = num - 1;
			while(vector.contains(low)) //for counting number less than the given number
			{
				vector.removeElement(low);
				low--;
				count++;
			}

			int up = num + 1;
			while(vector.contains(up))//for counting number greater than the given number
			{
				vector.removeElement(up);
				up++;
				count++;
			}

			length = Math.max(length, count);
		}
		return length;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size;
		int arr[] = new int[20];

		System.out.println("Enter the size of array");
		size = sc.nextInt();

		System.out.println("Enter the numbers");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		//int arr[] = {49, 1, 3, 200, 2, 4, 70, 5};

		System.out.println("The length of longest consecutive element sequence is " + sequenceLength(arr,size));

	}

}