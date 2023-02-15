import java.util.Scanner;

public class Driver {
	
	//Takes input and returns sum and product of the numbers
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5];
		
		System.out.println("Enter 5 integers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("Sum of your numbers: " + sum(numbers));
		System.out.println("Product of your numbers: " + product(numbers));
		
		input.close();
	}
	
	// Finds the sum of the numbers
	static int sum(int[] intArray) {
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum = sum+intArray[i];
		}
		
		return sum;
	}
	
	//Finds the product of the numbers
	static int product(int[] intArray) {
		int product = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			product = product*intArray[i];
		}

		return product;
	}
	
}
