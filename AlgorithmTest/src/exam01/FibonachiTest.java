package exam01;

import java.util.Scanner;

public class FibonachiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] d = new long[n+1];
		d[0]=0;
		d[1]=1;
		
		for(int i=2;i<d.length;i++){
			d[i] = d[i-1]+d[i-2];
		}
		System.out.println(d[n]%1000000);
		
	}

}
