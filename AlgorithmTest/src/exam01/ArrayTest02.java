package exam01;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[10];
		
		int sum = a*b*c;
		while(sum>0){
			arr[sum%10]++;
			sum/=10;
		}
		
		for(int x :arr){
			System.out.println(x);
		}
		
		
	}

}
