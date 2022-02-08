package Assignment01;

import java.util.*;

public class Problem08 {

	public static void main(String[] args) {
		Queue<Integer> Queue1 = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Queue: ");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to QUEUE: ");
			Queue1.add(scan.nextInt());
		}
	
		problemEight (Queue1,size);
		scan.close();
		
	}
	
	public static void problemEight(Queue<Integer> Q1, int size) {
		ArrayList<Integer> A1 = new ArrayList<>();
		ArrayList<Integer> A = new ArrayList<>();
		for (Integer item: Q1) {
            A1.add(item);
        }
		
		for(int i = 0; i < size/2; i++) {
			A.add(A1.get(size-i-1));
			A.add(A1.get(i));
		}
		if (size % 2 != 0) {
			A.add(A1.get(size/2));
		}
		
		System.out.println(A);
	}
	
	
}
