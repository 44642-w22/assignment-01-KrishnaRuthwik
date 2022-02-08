package Assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Problem09 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue<Integer> Queue = new LinkedList<>();
		Queue<Integer> Queue_even = new LinkedList<>();
		Queue<Integer> Queue_odd = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Queue :");
		int len = scan.nextInt();		
		System.out.println("Enter the list of Integers for Queue below :");
		for(int i=1; i<=len;i++) 
		{
			Queue.add(scan.nextInt());
		}		
		Queue<Integer> Q_dup = new LinkedList<>(Queue);
		for(int e : Q_dup) 
		{
			if(e%2==0) {
					Queue_even.add(e);	
			}else{
					Queue_odd.add(e);				
				}
		}
		List<Integer> A = new ArrayList<Integer>(len);			
		for(int i=0;i<len;i++) 
		{
				if(A.size()<len) 
				{
					if(!Queue_even.isEmpty()) 
					{
						A.add(Queue_even.poll());
					}
					if(A.size()<len) 
					{
						if(!Queue_odd.isEmpty()) 
						{
							A.add(Queue_odd.poll());	
						}
					}
				}
		}
		System.out.println("Output : " + A);
		scan.close();
	}
}