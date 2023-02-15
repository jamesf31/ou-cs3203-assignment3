import java.util.Scanner;

public class Driver {
	
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
	
	static int sum(int[] intArray) {
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum = sum+intArray[i];
		}
		
		return sum;
	}
	
	static int product(int[] intArray) {
		int product = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			product = product*intArray[i];
		}

		return product;
	}
	
	static int[] reverse(int[] intArray) {
		int[] reversedArray = new int[intArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			reversedArray[intArray.length-i-1] = intArray[i];
		}
		
		return reversedArray;
	}
}
