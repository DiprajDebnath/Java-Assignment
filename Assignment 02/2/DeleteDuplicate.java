/*2.Write a program to delete duplicate values from an array.*/

import java.util.Scanner;
public class DeleteDuplicate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count;
		int arr[] = new int[100];
		int tem[] = new int[100];
		
		System.out.println("Enter the size of array.");
		n = sc.nextInt();
		
		System.out.println("Enter your number");
		
		for(int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
			tem[i] = 1; // every number exist at least one
		}
		
		for(int i = 0; i < n; i++) 
		{
			count = 1;
			int num = arr[i];
			if(tem[i] != 0) 
			{
				for(int j = i+1; j < n; j++)
				{
					if(arr[j] == num)
					{
						count ++;
						tem[j] = 0;
					}
				}
				tem[i] = count;
			}
			
		}
		
//		//displaying the number of duplicate 
//		for(int i = 0; i < n; i++)
//		{
//			if(tem[i] != 0)
//			{
//				System.out.println(arr[i] + "=" + tem[i]);
//			}
//		}
		
		//deleting duplicate
		for(int i = 0; i < n; i++)
		{
			if(tem[i] == 0) 
			{
				for(int j = i; j < n; j++)
				{
					arr[i] = arr[i + 1];
					n--; //reduce the array size
				}
			}
		}
		
		//final array
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
	}
}
