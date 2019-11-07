/*Write an application that shows the sum of 1 to n for every n from 1 to 50. 
 *That is, the program displays 1 (the sum of 1 alone), 3 (the sum of 1 and 2), 
 *6(the sum of 1, 2, and 3), 10 (the sum of 1, 2, 3, and 4), and so on. 
 */

public class SumToN {

	public static void main(String[] args) {
		loop1 : for(int i = 1; i <= 50; i++) {
			int sum = 0;
			for(int j = 1; j <= i; j++) {
				sum = sum + j;
				if(sum > 50) break loop1;
			}
			System.out.println(sum);
		}
	}

}
