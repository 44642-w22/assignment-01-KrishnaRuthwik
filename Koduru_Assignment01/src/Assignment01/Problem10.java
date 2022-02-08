package Assignment01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem10 
{
	public static void main(String[] args) 
	{		
		Deque<String> Deq = new ArrayDeque<>();
		List<Integer> A_1 = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Deque below");
		int len = scan.nextInt();		
		System.out.println("Enter the list of Characters for Deque below");
		for(int i=1; i<=len;i++) {
			Deq.add(scan.next());
		}		
		System.out.println("Enter the length of Array of operations below");
		int lent_array = scan.nextInt();		
		System.out.println("Enter the Array of operations in 1 and 0 below ");
		for(int i=1; i<=lent_array;i++) {
			A_1.add(scan.nextInt());
		}		
		System.out.println("List of Deque : " + Deq);
		System.out.println("Array of operations : " + A_1);		
		Deque<String> D_dup = new LinkedList<>(Deq);
		Stack<String> Str = new Stack<>();		
		for(int e1 : A_1) {
			switch(e1) {
			 	case 1: if(!D_dup.isEmpty()) {
			 		Str.add(D_dup.pollFirst());
			 		break;
			 	}
			 	case 0: if(!Str.isEmpty()) {
			 		D_dup.addFirst(Str.pop());
			 		break;
			 	}
			}
		}		
		Iterator<String> objIterator = D_dup.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
		scan.close();
	}	
}