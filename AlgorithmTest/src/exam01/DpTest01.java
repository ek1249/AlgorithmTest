package exam01;

import java.util.Scanner;

public class DpTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[][] a = new int[n+1][3];
		int[][] dp = new int[n+1][3];
		
		for(int i=1;i<=n;i++){
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<=n;i++){
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+a[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2])+a[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1])+a[i][2];
		}
		
		System.out.println(Math.min(dp[n][2],Math.min(dp[n][0], dp[n][1])));
		sc.close();
		

	}

}
