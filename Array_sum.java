package assignment;

public class Array_sum {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int arrayValue : arr) {
			sum += arrayValue;
		}
		
		System.out.println("sum = " + sum);
	}
}
