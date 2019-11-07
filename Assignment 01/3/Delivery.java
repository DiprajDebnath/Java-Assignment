/*Create a constructor for the Delivery class that accepts arguments for the year, delivery number within 
 *the year, delivery distance code, and weight of the package. The constructor determines the eight-digit 
 *delivery number and delivery fee. Also include a method that displays every Delivery object field.
 */

import java.util.Scanner;

public class Delivery {

	long deliveryNum;
	float fee;
	int weight;
	int distanceCode;
	
	Delivery(int year, int num, int distance, int w){
		deliveryNum = year * 10000 + num;
		distanceCode = distance;
		weight = w;
	}

    void display() {
		if(distanceCode == 1) {
			if(weight < 5)
				fee = 12.00f;
			if(weight >= 5 && weight <= 20)
				fee = 16.50f;
			if(weight > 20)
				fee = 22.00f;
		}else if(distanceCode == 2) {
			if(weight < 5)
				fee = 35.00f;
			if(weight >= 5)
				fee = 47.95f;
		}
		System.out.println("Delivery Number = " + deliveryNum);
		System.out.println("Fee = " + fee);
	}
    
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter Delivery year");
		int year = sc.nextInt();

		System.out.println("Enter delivery number");
		int deliveryNum = sc.nextInt();

		System.out.println("Enter delivery distance code (for local 1 and for long distance 2)");
		int  disCode = sc.nextInt();

		System.out.println("Enter the weight");
		int  weight = sc.nextInt();
		
		Delivery obj = new Delivery(year, deliveryNum, disCode, weight);
		obj.display();

	}

}
