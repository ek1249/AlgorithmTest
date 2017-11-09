package exam01;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int[] num = new int[test_case];
		String[] str = new String[test_case];
		
		for(int i=0;i<test_case;i++){
			num[i] = sc.nextInt();
			str[i] = sc.next();
		}
		
		for(int i=0;i<str.length;i++){
			char[] chk = str[i].toCharArray();
			
			for(int j=0;j<chk.length;j++){
				for(int x=0;x<num[i];x++){
					System.out.print(chk[j]);
				}
			}
			
			System.out.println();
			
		}
		
		
	}

}
