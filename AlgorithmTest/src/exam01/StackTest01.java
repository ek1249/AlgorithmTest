package exam01;

import java.util.Scanner;
import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Object> stack = new Stack<Object>();
		
		for(int i=0;i<n;i++){
			String str = sc.nextLine();
			String[] strT = str.split(" ");
			switch(strT[0]){
			case"push":
				stack.push(strT[1]);
				break;
			case"pop":
				System.out.println(stack.isEmpty()?-1:stack.pop());
				break;
			case"size":
				System.out.println(stack.size());
				break;
			case "top":
				System.out.println(stack.isEmpty()?-1:stack.peek());
				break;
			case "empty":
				System.out.println(stack.isEmpty()?1:0);
				break;
			}
		}
		stack.clear();
		sc.close();
	}

}
