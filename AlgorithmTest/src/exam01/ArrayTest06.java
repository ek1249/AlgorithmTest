package exam01;

import java.util.Scanner;

public class ArrayTest06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int chk=0;
		int ace = 1;
		int des = 1;
		int mixed = 0;
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<7;i++){
			if(arr[i+1]-arr[i]>0){
				ace++;
			}
			if(arr[i+1]-arr[i]<0){
				des++;
			}
			if(ace!=8 && des !=8){
				mixed = 1;
			}
			
		}
		
		if(ace==8){
			System.out.println("ascending");
		}
		else if(des==8){
			System.out.println("descending");
		}
		else{
			System.out.println("mixed");
		}
		
		
		
	}
}
