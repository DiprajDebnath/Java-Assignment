/*1.Write a program to interchange the
 *  largest with the smallest element.
 */

import java.util.Scanner;
public class Interchange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int n, largest, smallest;
		
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		largest = 0;
		smallest = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[smallest] > arr[i]) {
				smallest = i;
			}
			if(arr[largest] < arr[i]) {
				largest = i;
			}
		}
		int temp = arr[smallest];
		arr[smallest] = arr[largest];
		arr[largest] = temp;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
