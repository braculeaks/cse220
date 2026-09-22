import java.util.Scanner;

public class Solution {

	static int findSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int  n = sc.nextInt();
		
		int[] arr  = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findSum(arr));

		sc.close();
		System.exit(0); // Do not remove this line
	}
}