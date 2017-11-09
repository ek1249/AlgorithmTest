package exam01;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int x = sc.nextInt();
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<x){
				System.out.print(arr[i]+" ");
			}
		}
	}

}
