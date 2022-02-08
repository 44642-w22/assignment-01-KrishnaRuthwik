package Assignment01;

import java.util.*;

public class Problem03 {

	public static void main(String[] args) {
		ArrayList<Integer> A_1 = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array A_1: ");
		int arraySize = scan.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements: ");
			A_1.add(scan.nextInt());
		}
		
		problemThree(A_1);
		scan.close();
	}
	
	public static void problemThree(ArrayList<Integer> A_1) {
		if(A_1.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		}
		else {
			Collections.sort(A_1);
			System.out.println(A_1.get(A_1.size()-1));
		}
	}
}
