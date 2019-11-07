/*3.Write a program to count the total 
 * number of non-zero elements in an array.
 */
import java.util.Scanner;

public class NonZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int size, count = 0;
		
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		
		System.out.println("Enter the numbers");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//To count the number of non-zero elements
		for(int i = 0; i < size; i++) {
			if(arr[i] > 0)
				count++;
		}
		
		System.out.println("Number of non-zero elements in the array are " + count);
	}
}
