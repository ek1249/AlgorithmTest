package exam01;

import java.util.Scanner;

public class IfTest01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num=0;
		//a가 중간값일때 
		if(a<=b && a>=c || a<=c && a>=b){
			num = a;
		}
		//b가 중간값일때 
		else if(b>=a && b<=c || b>=c && b<=a){
			num = b;
		}
		
		else if(c>=a && c<=b || c>=b && c<=a){
			num = c;
		}
		System.out.println(num);
		
			
		
	}
}
