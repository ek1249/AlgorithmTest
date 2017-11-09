package exam01;

import java.util.Scanner;

public class StringTest06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		char[] arrA = a.toCharArray();
		char[] arrB = b.toCharArray();
		String x="";
		String y="";
		for(int i=arrA.length-1;i>=0;i--){
			x += arrA[i]+"";
			y += arrB[i]+"";
		}
		
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		int max=num1;
		if(max<num2){
			max=num2;
		}
		
		System.out.println(max);
		
		
		
	}
}
