/*
 * 4.Write a program that reads an array of 10 integers.
 *  Display all the pairs of elements whose sum is 50.
 */
import java.util.Scanner;

class Fifty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int size = 10;
		
		
		System.out.println("Enter 10 numbers");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//For checking if the sum is 50
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				if((arr[i] + arr[j]) == 50)
				{
					System.out.println(arr[i] + " + " + arr[j]);
				}
			}
		}
		
	}
}
