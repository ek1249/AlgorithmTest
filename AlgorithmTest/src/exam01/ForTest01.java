package exam01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str.length()<100 && str.length()>0){
			
			for(int i=0;i<str.length();i++){
			
				String write = str.charAt(i)+"";
				System.out.print(write);
				
				if((i+1)%10==0){
					System.out.println();
				}
				
			}
			
		}
		
	}
}
