package exam01;

import java.util.Scanner;

public class DpTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n+1][m+1];
		int a,b,x,y=0;
		
		
		//m*n배열 생성 
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		int[] result = new int[k]; //합을 담을 배열 생성
		
		for(int i=0;i<k;i++){
			//for(int j=0;j<4;j++){
				int sum=0;
				a = sc.nextInt();
				b = sc.nextInt();
				x = sc.nextInt();
				y = sc.nextInt();
				
				for(int q=a;q<=x;q++){
					for(int w=b;w<=y;w++){
						sum+=arr[q][w];
					}
				}
				
			//}
			result[i]=sum;
		}
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
		
	}

}
