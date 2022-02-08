package Assignment01;

import java.util.*;

public class Problem06 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the even size of stack: ");
		int size = scan.nextInt();
		while(true) {
			if (size % 2 == 0) {
				break;
			}
			else {
				System.out.println("Sorry, you've given odd size. Please enter even size again: ");
				size = scan.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements below to store into the stack: ");
			stack.push(scan.nextInt());
		}
		
		problemSix(stack,size);
		scan.close();

	}
	
	public static void problemSix(Stack<Integer> stack, int size) {
		ArrayList<Integer> A_1 = new ArrayList<>();
		int p = size / 2;
		for (int i = 0; i < size; i++) {
			if(i < p) {
				A_1.add(stack.pop());
			}
			else {
				A_1.add(stack.get(i-p));
			}
		}
		System.out.println(A_1);
	}

}

