package exam01;

import java.util.Scanner;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		int avg=0;
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<40){
				arr[i] = 40;
			}
			sum+=arr[i];
		}
		
		avg = sum/5;
		System.out.println(avg);
	}

}
