package Assignment01;

import java.util.*;

public class Problem07 {

	public static void main(String[] args) {
		Queue<Integer> Queue = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Queue below: ");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements below: ");
			Queue.add(scan.nextInt());
		}
		problemSeven(Queue,size);
		scan.close();
	}
	
	public static void problemSeven(Queue<Integer> Q1, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + Q1.poll()*(int)(Math.pow(2, i));
		}
		System.out.println(sum);
	}

}

