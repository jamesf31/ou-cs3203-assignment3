
public class Driver {
	int sum(int[] intArray) {
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum = sum+intArray[i];
		}
		
		return sum;
	}
	
	int product(int[] intArray) {
		int product = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			product = product*intArray[i];
		}
		
		return product;
	}
}
