package exam01;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
	
		
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.next();
		}
		
		for(int i=0;i<n;i++){
			int cnt=0;
			int p=0;
			for(int j=0;j<arr[i].length();j++){
				char chk = arr[i].charAt(j);
				if(chk=='O'){
					p++;
					cnt+=p;
				}
				else{
					p=0;
				}
			}
			System.out.println(cnt);
			
		}
	}

}
