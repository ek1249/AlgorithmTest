package exam01;

import java.util.Scanner;

public class DpTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	
		int test_case = sc.nextInt();
		int[] arr = new int[11];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		
		for(int i=0;i<test_case;i++){
			int n = sc.nextInt();
			
			for(int j=4;j<=n;j++){
				arr[j]=arr[j-3]+arr[j-2]+arr[j-1];
			}
			
			System.out.println(arr[n]);
			
		}
		sc.close();
	}

}
