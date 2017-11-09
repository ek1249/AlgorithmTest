package exam01;

import java.util.Scanner;

public class IfTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i=0;i<c;i++){
			int sum=0;
			int idx=0;
			int avg=0;
			int n = sc.nextInt();
			double score[] =new double[n];
			double arr[] = new double[n];
			for(int j=0;j<n;j++){
				if(sc.hasNextInt()){
					
				
				arr[j] = sc.nextInt();
				sum+=arr[j];
				score[j] = arr[j];
				}
				}
			
			avg = sum/n;
			for(int k=0;k<n;k++){
				if(score[k]>avg){
					idx++;
				}
			}
			double rate = (double)idx/n;
			System.out.printf("%.3f",rate);
			System.out.println("%");
			
		}
	}

}
