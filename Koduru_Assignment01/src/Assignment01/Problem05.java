package Assignment01;

import java.util.*;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input brackets :");  
		String strInput = scan.nextLine();
		problemFive(strInput);
		scan.close();
	}

	private static void problemFive(String strInput) {
		boolean default1 = true;
		ArrayList<Character> openBrackets = new ArrayList<>();
		openBrackets.add('(');
		openBrackets.add('[');
		openBrackets.add('{');

		Stack<Character> inputStack = new Stack<>(); 
		for (int i = 0; i < strInput.length(); i++) {
			if (openBrackets.contains(strInput.charAt(i))) {
				inputStack.push(strInput.charAt(i));

			} else {
				char peekEle;
				if (inputStack.size() > 0) {
					peekEle = inputStack.peek();
				} else {
					default1 = false;
					break;
				}

				if (inputStack.size() > 0 && (peekEle == '{' && strInput.charAt(i) == '}'
						|| peekEle == '(' && strInput.charAt(i) == ')'
						|| peekEle == '[' && strInput.charAt(i) == ']')) {
					inputStack.pop();
				} else {
					default1 = false;
					break;
				}
			}
		}

		if (default1 && inputStack.isEmpty())
			System.out.println(true);
		else
			System.out.println(false);

	}
}

