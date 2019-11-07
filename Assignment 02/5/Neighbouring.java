/*5.Write a program to find the smallest
 * between two neighboring numbers in an array. 
 * For example, in the sequence 4, 8, 6, 1, 2, 9, 4 
 * the minimum distance is 1 (between 1 and 2).
 */
import java.util.Scanner;

public class Neighbouring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int size, min, minloc;
		
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		
		System.out.println("Enter the numbers");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		min = Math.abs(arr[0] - arr[1]);
		minloc = 0;
		for(int i = 0; i < size-1; i++) {
			if(min > Math.abs(arr[i] - arr[i + 1]))
			{
				min = Math.abs(arr[i] - arr[i + 1]);
				minloc = i;
			}
		}
		
		System.out.println("Minimum distance is " + min + " between " + arr[minloc] + " and " + arr[minloc + 1]);
	}

}
