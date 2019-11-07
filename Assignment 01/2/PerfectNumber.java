/*Write an application that displays every perfect number from 1 through 1,000.
 */

/*A perfect number is a positive integer that is equal to 
 * the sum of its positive divisors, excluding the number
 * itself. For example 28 has divisors 1, 2, 4, 7, 14 and
 * 1 + 2 + 4 + 7 + 14 = 28, so 28 is a perfect number.
 */
public class PerfectNumber {
	public static void main(String[] args) {
		int sum;
		for(int i = 2; i <= 1000; i++) 
		{
			sum = 0; 
			for(int j = 1; j < i; j++) 
			{
				if(i % j == 0) 
					sum = sum + j;
			}
			if(sum == i)
				System.out.println(i);
		}
	}
}
