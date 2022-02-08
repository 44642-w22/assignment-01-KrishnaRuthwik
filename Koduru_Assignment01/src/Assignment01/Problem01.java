package Assignment01;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		LinkedList<Integer> List_1 = new LinkedList<>();
		System.out.println("enter the size");
		int array_Size = scam.nextInt();
		while(array_Size>0) { 
			System.out.println("Enter the elements to the list : ");
	        List_1.add(scam.nextInt());
	        array_Size--;  
	        }
	        scam.close();
	    problemOne(List_1);
	}
	public static void problemOne(LinkedList<Integer> List_1) {
    	LinkedList<Integer> List_2 = new LinkedList<>();
    	for (int i = 0; i < List_1.size(); i++) {
    		int a = List_1.get(i);
    		int sum = 0;
    		for (int j=1; j<=a/2; j++) {
    			if (a%j == 0) {
    				sum += j;
    			}
    		}
    		if (sum == a) {
    			List_2.add(a);
    		}
    	}
    	System.out.println(List_2);
    }
}

