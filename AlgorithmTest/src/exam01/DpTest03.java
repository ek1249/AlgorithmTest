package exam01;

import java.util.Arrays;
import java.util.Scanner;

public class DpTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<n;i++){
			for(int j=0;j<=i;j++){
				
				if(j==0){
					arr[i][j]+=arr[i-1][j];
				}
				else if(i==j){
					arr[i][j]+=arr[i-1][j-1];
				}
				else{
					arr[i][j]=Math.max(arr[i][j]+arr[i-1][j-1],arr[i][j]+arr[i-1][j]);
				}
				
				
			}
		}
		
		int max=0;
		for(int i=0;i<n;i++){
			
			if(max<arr[n-1][i]){
				max=arr[n-1][i];
			}
		}
		
		System.out.println(max);
		
		
	}

}
