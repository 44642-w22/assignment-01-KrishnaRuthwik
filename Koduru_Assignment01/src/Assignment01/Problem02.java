package Assignment01;

import java.util.*;

public class Problem02 {

	public static void main(String[] args) {Scanner Scan = new Scanner(System.in);
	LinkedList<Integer> List_1 = new LinkedList<>();
	System.out.println("Enter the size of linked list L1: ");
	int listSize = Scan.nextInt();
	System.out.println("Enter the value of k whose sum equal to pairs of continuous elements in L1: ");
	int k = Scan.nextInt();
	while(listSize>0) { 
		System.out.println("Enter the elements to add into list L1: ");
        List_1.add(Scan.nextInt());
        listSize--;    
        }
        Scan.close();   
        
    problemTwo(List_1,k);
    
}
public static void problemTwo(LinkedList<Integer> List_1, int k) {
	
	LinkedList<ArrayList<Integer>> List_2 = new LinkedList<>();
	for (int i = 0; i <List_1.size()-1; i++) {
		ArrayList<Integer> pair = new ArrayList<>();
			if (k == (List_1.get(i)+List_1.get(i+1))) {
				pair.add(List_1.get(i));
				pair.add(List_1.get(i+1));
				List_2.add(pair);
			}
			
		}
	System.out.println(List_2);
	}
	
}
