package Assignment01;

import  java.util.*;

public class Problem04 {

	public static void main(String[] args) {
		ArrayList<String> A_1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array list A_1: ");
		int arraySize = scan.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements to store into array list A_1: ");
			A_1.add(scan.next());
		}
		
		problemFour(A_1, arraySize);
		scan.close();
	}
	
	public static void problemFour(ArrayList<String> A_1, int size) {
		ArrayList<String> A_2 = new ArrayList<String>();
		int [] arr = new int [size];
		for (int i = 0; i < size; i++) {
			arr[i] = A_1.get(i).length();
		}
			
		Arrays.sort(arr);
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] == A_1.get(j).length()) {
					A_2.add(A_1.get(j));
					A_1.set(j, "");
				}
			}
		}
		
		System.out.println(A_2);	
	}
}

